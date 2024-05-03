package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Story;
import com.example.segurityshoppingcart.Operational.Store.IService.IStoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/story")
public class StoryController extends ABaseController<Story, IStoryService>{

	protected StoryController(IStoryService service) {
		super(service, "story");
	}

}
