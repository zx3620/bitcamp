package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.util.ArrayList;

public class TeamMemberDao {


    private ArrayList teamCollection = new ArrayList();
    private ArrayList memberCollection = new ArrayList();

    private int getIndex(String teamName, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < teamCollection.size(); i++) {
            String tn = ((String)this.teamCollection.get(i)).toLowerCase();
            String mi = ((String)this.memberCollection.get(i)).toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }

        return -1;
    }

    public int addMember(String teamName, String memberId) {
        if ( this.isExist(teamName, memberId)) {
            return 0;                    
        }
        this.teamCollection.add(teamName);
        this.memberCollection.add(memberId);
        return 1;
    }


    public int deleteMember(String teamName, String memberId) {
        int index = this.getIndex(teamName, memberId);
        if ( index < 0) {
            return 0;                    
        }
        teamCollection.remove(index);
        memberCollection.remove(index);
        return 1;
    }



    public boolean isExist(String teamName, String memberId) {
        if(this.getIndex(teamName, memberId) < 0) {
            return false;
        } else {
            return true;
        }

    }
    private int getMembersCount(String teamName) {
        int cnt = 0;
        String ptn = teamName.toLowerCase();
        
        for (int i = 0; i < this.teamCollection.size(); i++) {
            String tn = ((String)this.teamCollection.get(i)).toLowerCase();
            if (tn.equals(ptn)) {
                cnt++;
            }
        }
        return cnt;
    }

    public String[] getMembers(String teamName) {
        String[] members = new String[this.getMembersCount(teamName)];
      
        for (int i = 0, x = 0; i < this.teamCollection.size(); i++) {
            if (((String)this.teamCollection.get(i)).toLowerCase()
                    .equals(teamName.toLowerCase())) {
                
                members[x++] = (String)this.memberCollection.get(i);
            }
        }
        return members;
    }

}