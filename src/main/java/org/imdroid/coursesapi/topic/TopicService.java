package org.imdroid.coursesapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("Java","Java name","Java Description"),
            new Topic("JavaScript","JavaScript name","JavaScript Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
         topics.add(topic);
    }

    public void updateTopic(Topic topic, String id){
        for(int i=0;i<topics.size();i++){
            if(topics.get(i).getId().equalsIgnoreCase(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        topics.removeIf(topic -> topic.getId().equalsIgnoreCase(id));
    }

}
