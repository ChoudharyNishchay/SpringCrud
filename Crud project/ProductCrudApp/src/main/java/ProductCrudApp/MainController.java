package ProductCrudApp;

import ProductCrudApp.Dao.ProductDao;
import ProductCrudApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home(Model m){

        List<Product> products= productDao.getProducts();
        m.addAttribute("products", products);
        return "index";
    }


    //show add product form
    @RequestMapping("/add-product")
    public String addProduct(Model model){
        model.addAttribute("title","Add Product");
        return "add_product_form";
    }

    //handle add product form
    @RequestMapping( value = "/handle-Product",method = RequestMethod.POST)
    public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request){
        System.out.println(product);
        productDao.createProduct(product);
       RedirectView redirectView= new RedirectView();
       redirectView.setUrl(request.getContextPath()+ "/");
       return redirectView;
    }

    //handler delete

    @RequestMapping("/delete/{productId}")
    public RedirectView deleteproduct(@PathVariable("productId") int productID ,HttpServletRequest request){
        this.productDao.deleteProduct(productID);
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl(request.getContextPath()+ "/");
        return redirectView;
    }
    @RequestMapping("/update/{productId}")
    public String updateform(@PathVariable("productId") int pid, Model model){
        Product product = this.productDao.getProducts(pid);
        model.addAttribute("product",product);
        return "update-form";
    }



}
