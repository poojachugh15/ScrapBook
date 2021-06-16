package com.ScrapBook.scrapbook_service_db.components;

import com.ScrapBook.scrapbook_service_db.models.Post;
import com.ScrapBook.scrapbook_service_db.models.Room;
import com.ScrapBook.scrapbook_service_db.models.User;
import com.ScrapBook.scrapbook_service_db.repositories.MessageRepository;
import com.ScrapBook.scrapbook_service_db.repositories.PostRepository;
import com.ScrapBook.scrapbook_service_db.repositories.RoomRepository;
import com.ScrapBook.scrapbook_service_db.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PostRepository postRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        Room room = new Room("Memory Lane", "Giritli's ScrapBook", "123456", "ahmet@gmail.com");
        roomRepository.save(room);


        Room room2 = new Room("CodeClan Tears", "where tears come true...", "123456", "mary@gmail.com");

        roomRepository.save(room2);

        Room room3 = new Room("Time Machine", "Liam's ScrapBook", "123456", "liam@gmail.com");
        roomRepository.save(room3);

        Room room4 = new Room("Happy Times", "Pooja's ScrapBook", "123456", "pooja@gmail.com");
        roomRepository.save(room4);

        Room room5 = new Room("40th Birthday", "Ahmet's Birthday Party", "123456", "ahmet@gmail.com");
        roomRepository.save(room5);

        Room room6 = new Room("Cats", "Scrapbook of reasons why we live with these little terrors.", "123456", "mary@gmail.com");
        roomRepository.save(room6);

        Room room7 = new Room("CodeClan Tears", "Remembering React.", "123456", "mary@gmail.com");
        roomRepository.save(room7);



        User user = new User("ahmet@gmail.com","Ahmet","01/11/1974", "metallica");
        userRepository.save(user);

        User user2 = new User("mary@gmail.com", "Mary", "01/06/1978", "123456");
        userRepository.save(user2);

        User liam = new User("liam@gmail.com", "Liam", "01/01/1990", "123456");
        liam.setProfilePicture("https://firebasestorage.googleapis.com/v0/b/scrapbook-245c8.appspot.com/o/profile-pics%2Fahmet-age-30.jpeg?alt=media&token=b04bc8b8-597c-4b95-a033-03527672e89d");
        userRepository.save(liam);

        User pooja = new User("pooja@gmail.com", "Pooja", "01/01/1990", "123456");
        pooja.setProfilePicture("https://firebasestorage.googleapis.com/v0/b/scrapbook-245c8.appspot.com/o/profile-pics%2Fpooja.jpeg?alt=media&token=8418f4ee-3ae3-4bf3-b131-ff4dad89eda9");
        userRepository.save(pooja);





        Post post2 = new Post(LocalTime.now().toString(), "I love REACT", "img/pic", room3, liam);
        postRepository.save(post2);

        Post post8 = new Post(LocalTime.now().toString(), "Climbing Holiday", "img/pic", room3, liam);
        postRepository.save(post8);


        Post post3 = new Post(LocalTime.now().toString(), "NOT AN IMAGE", "img/pic", room4, user2);
        postRepository.save(post3);

        Post post7 = new Post(LocalTime.now().toString(), "Glasgow Road Trip", "img/pic", room2, user2);
        postRepository.save(post7);


        Post post6 = new Post(LocalTime.now().toString(), "Happy Times", "https://firebasestorage.googleapis.com/v0/b/scrapbook-245c8.appspot.com/o/posts%2FWhatsApp%20Image%202021-06-16%20at%205.33.08%20PM.jpeg?alt=media&token=5dd0b50c-baba-4121-92df-d4157c2d99e3", room4, pooja);
        postRepository.save(post6);

        Post post9 = new Post(LocalTime.now().toString(), "Indian Cooking", "https://firebasestorage.googleapis.com/v0/b/scrapbook-245c8.appspot.com/o/posts%2FWhatsApp%20Image%202021-06-16%20at%205.32.10%20PM.jpeg?alt=media&token=05d357b9-34e2-4c19-b279-ca5b96d36649", room4, pooja);
        postRepository.save(post9);



//        user.addRoom(room);
//        userRepository.save(user);

        room.addUser(user2);
        roomRepository.save(room);


        room2.addUser(user2);
        room2.addUser(liam);
        room2.addUser(pooja);
        roomRepository.save(room2);


        room3.addUser(liam);
        roomRepository.save(room3);

        room4.addUser(pooja);
        roomRepository.save(room4);


    }
}
