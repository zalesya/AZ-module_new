package by.nc.school.dev.web.controller;

import by.nc.school.dev.web.provider.ModelProvider;
import by.nc.school.dev.web.util.Pages;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(Pages.VIEWS.PATH_ABSOLUTE)
public class ViewController {
    protected Map<String, ModelProvider> modelProviders;

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(Model model) {
        return "redirect:" + Pages.VIEWS.LOGIN.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.VIEWS.STUDENT.PATH)
    public String getStudentPage(Model model) {
        processRequest(model, Pages.VIEWS.STUDENT.VIEW);
        return Pages.VIEWS.STUDENT.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.VIEWS.PROFESSOR.PATH)
    public String getProfessorPage(Model model) {
        processRequest(model, Pages.VIEWS.PROFESSOR.VIEW);
        return Pages.VIEWS.PROFESSOR.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.VIEWS.LOGIN.PATH)
    public String getLoginPage(Model model) {
        processRequest(model, Pages.VIEWS.LOGIN.VIEW);
        return Pages.VIEWS.LOGIN.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.VIEWS.ACCOUNT.PATH)
    public String getAccountPage(Model model) {
        processRequest(model, Pages.VIEWS.ACCOUNT.VIEW);
        return Pages.VIEWS.ACCOUNT.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.VIEWS.ABOUT.PATH)
    public String getAboutPage(Model model) {
        processRequest(model, Pages.VIEWS.ABOUT.VIEW);
        return Pages.VIEWS.ABOUT.VIEW;
    }

    protected void processRequest(Model model, String view) {
        ModelProvider modelProvider = modelProviders.get(view);
        if (modelProvider != null) {
            modelProvider.fillModel(model);
        }
    }

    @Required
    public void setModelProviders(Map<String, ModelProvider> modelProviders) {
        this.modelProviders = modelProviders;
    }
}
