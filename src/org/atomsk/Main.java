package org.atomsk;



public class Main {

    public static void main(String[] args) {
//        ReviewVO vo = new ReviewVO();
//        vo.setMid("atomsk");
//        vo.setMno(21);
//        vo.setScore(5.0);
//        vo.setCmt("이런걸 돈주고 사먹다니... 차마 돈으로 환산할수 없는 맛");
//        ReviewDAO dao = ne  w ReviewDAO();
//        dao.add(vo);

        MenuDAO menuDAO = new MenuDAO();
        System.out.println(menuDAO.getMenus(4));

    }
}
