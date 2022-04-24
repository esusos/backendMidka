package kz.zero.webmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/phones")
    public String products(Model model) {
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/add-product")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add-product")
    public String addPhone(@ModelAttribute Product product) {
        products.add(product);
        System.out.println(product.getName() + " " + product.getProducer());
        return "redirect:/products";
    }

    @GetMapping("/products/{id}")
    public String getPhone(@PathVariable int id, Model model) {
        model.addAttribute("productByName", products.get(id));
        return "/product";
    }
}
