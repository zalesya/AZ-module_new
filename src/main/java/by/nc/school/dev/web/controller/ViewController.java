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

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.STUDENT.PATH)
    public String getStudentPage(Model model) {
        processRequest(model, Pages.VIEWS.STUDENT.VIEW);
        return Pages.VIEWS.STUDENT.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.PROFESSOR.PATH)
    public String getProfessorPage(Model model) {
        processRequest(model, Pages.VIEWS.PROFESSOR.VIEW);
        return Pages.VIEWS.PROFESSOR.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.LOGIN.PATH)
    public String getLoginPage(Model model) {
        processRequest(model, Pages.VIEWS.LOGIN.VIEW);
        return Pages.VIEWS.LOGIN.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.REGISTER.PATH)
    public String getRegisterPage(Model model) {
        processRequest(model, Pages.VIEWS.REGISTER.VIEW);
        return Pages.VIEWS.REGISTER.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.LOGOUT.PATH)
    public String getLogoutPage(Model model) {
        processRequest(model, Pages.VIEWS.LOGOUT.VIEW);
        return Pages.VIEWS.LOGIN.VIEW;
    }

    @RequestMapping(method = RequestMethod.GET, path = Pages.VIEWS.ACCOUNT.PATH)
    public String getAccountPage(Model model) {
        processRequest(model, Pages.VIEWS.ACCOUNT.VIEW);
        return Pages.VIEWS.ACCOUNT.VIEW;
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
