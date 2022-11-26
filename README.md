# :computer: Introduction Spring

- <b>Core do Spring</b>
  - 

---



- <b>Spring IoC Container</b> ( Inversão de Controle )
  - O que é Inversão de Controle 
    - É um princípio de design de programas de computadores onde a sequência (controle) de chamadas dos métodos é invertida em relação á programação tradicional, ou seja, ela não é determinada diretamente pelo programador.

---

- <b>Application Context</b>
  - Configurações 
    - XML
    - Código Java
    - Anotações Java
      - <b>@Component</b> 
      - <b>@Controller</b>
      - <b>@Service</b> 
      - <b>@Autowired</b>

----

- <b>Spring Beans</b>

  - O que é uma Bean
    - É qualquer objeto gerenciado pelo Spring Ioc.

- <b>Stereotypes</b>

  - <b>@Component</b> (Essa anotação é usada em classes para indicar um componente Spring. O @Componente a anotação marca a classe Java como um bean ou, digamos, componente para que o mecanismo de verificação de componentes do Spring possa ser incluído no contexto do aplicativo.)

    

  - <b>@Controller</b> ( A anotação @Controller é usada para indicar que a classe é um controlador Spring. Essa anotação pode ser usada para identificar controladores para Spring MVC ou Spring WebFlux.)

    

  - <b>@RestController</b> (Essa anotação é usada no nível de classe. o @RestController A anotação marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma visão. Ao anotar uma classe com esta anotação, você não precisa mais adicionar @ResponseBody para todo o método RequestMapping. Isso significa que você não usa mais resolvedores de exibição ou envia html em resposta. Você apenas envia o objeto de domínio como resposta HTTP no formato que é entendido pelos consumidores como JSON.)

    

  - <b>@Service</b> ( Esta anotação é usada em uma classe. o @Serviço marca uma classe Java que executa algum serviço, como executar lógica de negócios, realizar cálculos e chamar APIs externas. Esta anotação é uma forma especializada do @Componente anotação destinada a ser usada na camada de serviço.)

    

  - <b>@Autowired</b> ( Quando você usa @Autowirede em campos e passar os valores para os campos usando o nome da propriedade, o Spring atribuirá automaticamente os campos com os valores passados.)

    

  - <b>@Repository</b> ( Esta anotação é utilizada em classes Java que acessam diretamente o banco de dados. o @Repositório. A anotação funciona como marcador para qualquer classe que cumpra o papel de repositório ou objeto de acesso a dados.)

    

  - <b>@Configuration</b> (Esta anotação é usada em classes que definem beans. @Configuração é um análogo para arquivo de configuração XML – é configuração usando classe Java. Classe Java anotada com @Configuração é uma configuração por si só e terá métodos para instanciar e configurar as dependências.)

---

- <h3>Bean Scopes</h3>

  - <b>Singleton</b>
  - <b>Prototype</b>
  - <b>Request</b>
  - <b>Session</b>
  - <b>Application</b>
  - <b>WebSocket</b>

---

- <h3>Injeção de dependências</h3>

  - <b>O que é Injeção de Dependências?</b>
    - É uma forma de aplicar <b>inversão de controle</b> em uma classe que utiliza funcionalidades de outras classes; 
  - <b>Proxies Setter</b>
    - <b>Autowired</b> ( Propriedades - Construtores - Métodos)
  - <b>CDI</b>
    - O CDI é a especificação Java que define a injeção de dependência e inversão de controle para aplicações JavaEE.

---

<h2>Curso Finalizado - Certificado</h2>

 <img src="BB887430.png">