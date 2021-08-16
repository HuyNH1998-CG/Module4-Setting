package Service;

import Model.Setting;

public class UserService {
    public Setting setting;

    public UserService(){
        this.setting = new Setting("English",25,false,"Thor");
    }

    public void saveSetting(Setting setting){
        this.setting = setting;
    }

}
