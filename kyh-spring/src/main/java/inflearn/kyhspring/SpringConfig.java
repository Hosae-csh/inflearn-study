//package inflearn.kyhspring;
//
//import inflearn.kyhspring.repository.MemberRepository;
//import inflearn.kyhspring.repository.MemoryMemberRepository;
//import inflearn.kyhspring.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringConfig {
//
//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}
