
package br.com.lemontech.selfbooking.wsselfbooking.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.lemontech.selfbooking.wsselfbooking.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarParametrizacaoViajante_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajante");
    private final static QName _AlterarStatusTarifario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifario");
    private final static QName _AlterarStatusSubCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCusto");
    private final static QName _CadastrarTarifario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifario");
    private final static QName _CadastrarRegional_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegional");
    private final static QName _CadastrarProjeto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjeto");
    private final static QName _AlterarStatusProjeto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjeto");
    private final static QName _SincronizarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacao");
    private final static QName _InserirIdentificadorIntegracao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracao");
    private final static QName _AlterarStatusCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCusto");
    private final static QName _CadastrarSubCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCustoResponse");
    private final static QName _AlterarStatusRegional_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegional");
    private final static QName _AlterarStatusTarifarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifarioResponse");
    private final static QName _CadastrarParametrizacaoViajanteResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajanteResponse");
    private final static QName _AlterarStatusProjetoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjetoResponse");
    private final static QName _AlterarStatusCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCustoResponse");
    private final static QName _AprovarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacao");
    private final static QName _CadastrarRegionalResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegionalResponse");
    private final static QName _PesquisarVendasConsolidadora_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadora");
    private final static QName _CadastrarFuncionarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionarioResponse");
    private final static QName _KeyClient_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient");
    private final static QName _AlterarStatusContaContabil_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabil");
    private final static QName _AlterarStatusFuncionarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionarioResponse");
    private final static QName _CadastrarFornecedorSource_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSource");
    private final static QName _AlterarStatusFuncionario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionario");
    private final static QName _DeletarParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCusto");
    private final static QName _AlterarStatusSubCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCustoResponse");
    private final static QName _CadastrarTarifarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifarioResponse");
    private final static QName _CadastrarSubCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCusto");
    private final static QName _ReprovarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacaoResponse");
    private final static QName _CadastrarCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCusto");
    private final static QName _InserirItemDespesa_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesa");
    private final static QName _CadastrarFuncionario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionario");
    private final static QName _AlterarStatusRegionalResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegionalResponse");
    private final static QName _CadastrarFornecedor_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedor");
    private final static QName _CadastrarFornecedorSourceResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSourceResponse");
    private final static QName _PesquisarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacaoResponse");
    private final static QName _SincronizarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacaoResponse");
    private final static QName _AprovarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacaoResponse");
    private final static QName _DeletarParametrizacaoViajante_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajante");
    private final static QName _AlterarStatusFornecedorResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedorResponse");
    private final static QName _PesquisarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacao");
    private final static QName _CadastrarFornecedorResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorResponse");
    private final static QName _InserirItemDespesaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesaResponse");
    private final static QName _DeletarParametrizacaoViajanteResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajanteResponse");
    private final static QName _ReprovarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacao");
    private final static QName _CadastrarParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCustoResponse");
    private final static QName _AlterarStatusContaContabilResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabilResponse");
    private final static QName _PesquisarVendasConsolidadoraResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadoraResponse");
    private final static QName _UserPassword_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword");
    private final static QName _CadastrarCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCustoResponse");
    private final static QName _CadastrarContaContabil_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabil");
    private final static QName _CadastrarContaContabilResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabilResponse");
    private final static QName _DeletarParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCustoResponse");
    private final static QName _AlterarStatusFornecedor_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedor");
    private final static QName _UserName_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName");
    private final static QName _CadastrarParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCusto");
    private final static QName _InserirIdentificadorIntegracaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracaoResponse");
    private final static QName _CadastrarProjetoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjetoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.lemontech.selfbooking.wsselfbooking.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoViajante")
    public JAXBElement<CadastrarParametrizacaoViajanteRequest> createCadastrarParametrizacaoViajante(CadastrarParametrizacaoViajanteRequest value) {
        return new JAXBElement<CadastrarParametrizacaoViajanteRequest>(_CadastrarParametrizacaoViajante_QNAME, CadastrarParametrizacaoViajanteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusTarifario")
    public JAXBElement<AlterarStatusTarifarioRequest> createAlterarStatusTarifario(AlterarStatusTarifarioRequest value) {
        return new JAXBElement<AlterarStatusTarifarioRequest>(_AlterarStatusTarifario_QNAME, AlterarStatusTarifarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusSubCentroDeCusto")
    public JAXBElement<AlterarStatusSubCentroDeCustoRequest> createAlterarStatusSubCentroDeCusto(AlterarStatusSubCentroDeCustoRequest value) {
        return new JAXBElement<AlterarStatusSubCentroDeCustoRequest>(_AlterarStatusSubCentroDeCusto_QNAME, AlterarStatusSubCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTarifario")
    public JAXBElement<CadastrarTarifarioRequest> createCadastrarTarifario(CadastrarTarifarioRequest value) {
        return new JAXBElement<CadastrarTarifarioRequest>(_CadastrarTarifario_QNAME, CadastrarTarifarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarRegional")
    public JAXBElement<CadastrarRegionalRequest> createCadastrarRegional(CadastrarRegionalRequest value) {
        return new JAXBElement<CadastrarRegionalRequest>(_CadastrarRegional_QNAME, CadastrarRegionalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarProjeto")
    public JAXBElement<CadastrarProjetoRequest> createCadastrarProjeto(CadastrarProjetoRequest value) {
        return new JAXBElement<CadastrarProjetoRequest>(_CadastrarProjeto_QNAME, CadastrarProjetoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusProjeto")
    public JAXBElement<AlterarStatusProjetoRequest> createAlterarStatusProjeto(AlterarStatusProjetoRequest value) {
        return new JAXBElement<AlterarStatusProjetoRequest>(_AlterarStatusProjeto_QNAME, AlterarStatusProjetoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "sincronizarSolicitacao")
    public JAXBElement<SincronizarSolicitacaoRequest> createSincronizarSolicitacao(SincronizarSolicitacaoRequest value) {
        return new JAXBElement<SincronizarSolicitacaoRequest>(_SincronizarSolicitacao_QNAME, SincronizarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirIdentificadorIntegracao")
    public JAXBElement<InserirIdentificadorIntegracaoRequest> createInserirIdentificadorIntegracao(InserirIdentificadorIntegracaoRequest value) {
        return new JAXBElement<InserirIdentificadorIntegracaoRequest>(_InserirIdentificadorIntegracao_QNAME, InserirIdentificadorIntegracaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusCentroDeCusto")
    public JAXBElement<AlterarStatusCentroDeCustoRequest> createAlterarStatusCentroDeCusto(AlterarStatusCentroDeCustoRequest value) {
        return new JAXBElement<AlterarStatusCentroDeCustoRequest>(_AlterarStatusCentroDeCusto_QNAME, AlterarStatusCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarSubCentroDeCustoResponse")
    public JAXBElement<CadastrarSubCentroDeCustoResponse> createCadastrarSubCentroDeCustoResponse(CadastrarSubCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarSubCentroDeCustoResponse>(_CadastrarSubCentroDeCustoResponse_QNAME, CadastrarSubCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusRegional")
    public JAXBElement<AlterarStatusRegionalRequest> createAlterarStatusRegional(AlterarStatusRegionalRequest value) {
        return new JAXBElement<AlterarStatusRegionalRequest>(_AlterarStatusRegional_QNAME, AlterarStatusRegionalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusTarifarioResponse")
    public JAXBElement<AlterarStatusTarifarioResponse> createAlterarStatusTarifarioResponse(AlterarStatusTarifarioResponse value) {
        return new JAXBElement<AlterarStatusTarifarioResponse>(_AlterarStatusTarifarioResponse_QNAME, AlterarStatusTarifarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoViajanteResponse")
    public JAXBElement<CadastrarParametrizacaoViajanteResponse> createCadastrarParametrizacaoViajanteResponse(CadastrarParametrizacaoViajanteResponse value) {
        return new JAXBElement<CadastrarParametrizacaoViajanteResponse>(_CadastrarParametrizacaoViajanteResponse_QNAME, CadastrarParametrizacaoViajanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusProjetoResponse")
    public JAXBElement<AlterarStatusProjetoResponse> createAlterarStatusProjetoResponse(AlterarStatusProjetoResponse value) {
        return new JAXBElement<AlterarStatusProjetoResponse>(_AlterarStatusProjetoResponse_QNAME, AlterarStatusProjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusCentroDeCustoResponse")
    public JAXBElement<AlterarStatusCentroDeCustoResponse> createAlterarStatusCentroDeCustoResponse(AlterarStatusCentroDeCustoResponse value) {
        return new JAXBElement<AlterarStatusCentroDeCustoResponse>(_AlterarStatusCentroDeCustoResponse_QNAME, AlterarStatusCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "aprovarSolicitacao")
    public JAXBElement<AprovarSolicitacaoRequest> createAprovarSolicitacao(AprovarSolicitacaoRequest value) {
        return new JAXBElement<AprovarSolicitacaoRequest>(_AprovarSolicitacao_QNAME, AprovarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarRegionalResponse")
    public JAXBElement<CadastrarRegionalResponse> createCadastrarRegionalResponse(CadastrarRegionalResponse value) {
        return new JAXBElement<CadastrarRegionalResponse>(_CadastrarRegionalResponse_QNAME, CadastrarRegionalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarVendasConsolidadora")
    public JAXBElement<PesquisarVendasConsolidadoraRequest> createPesquisarVendasConsolidadora(PesquisarVendasConsolidadoraRequest value) {
        return new JAXBElement<PesquisarVendasConsolidadoraRequest>(_PesquisarVendasConsolidadora_QNAME, PesquisarVendasConsolidadoraRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFuncionarioResponse")
    public JAXBElement<CadastrarFuncionarioResponse> createCadastrarFuncionarioResponse(CadastrarFuncionarioResponse value) {
        return new JAXBElement<CadastrarFuncionarioResponse>(_CadastrarFuncionarioResponse_QNAME, CadastrarFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "keyClient")
    public JAXBElement<String> createKeyClient(String value) {
        return new JAXBElement<String>(_KeyClient_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusContaContabil")
    public JAXBElement<AlterarStatusContaContabilRequest> createAlterarStatusContaContabil(AlterarStatusContaContabilRequest value) {
        return new JAXBElement<AlterarStatusContaContabilRequest>(_AlterarStatusContaContabil_QNAME, AlterarStatusContaContabilRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFuncionarioResponse")
    public JAXBElement<AlterarStatusFuncionarioResponse> createAlterarStatusFuncionarioResponse(AlterarStatusFuncionarioResponse value) {
        return new JAXBElement<AlterarStatusFuncionarioResponse>(_AlterarStatusFuncionarioResponse_QNAME, AlterarStatusFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorSource")
    public JAXBElement<CadastrarFornecedorSourceRequest> createCadastrarFornecedorSource(CadastrarFornecedorSourceRequest value) {
        return new JAXBElement<CadastrarFornecedorSourceRequest>(_CadastrarFornecedorSource_QNAME, CadastrarFornecedorSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFuncionario")
    public JAXBElement<AlterarStatusFuncionarioRequest> createAlterarStatusFuncionario(AlterarStatusFuncionarioRequest value) {
        return new JAXBElement<AlterarStatusFuncionarioRequest>(_AlterarStatusFuncionario_QNAME, AlterarStatusFuncionarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoCentroDeCusto")
    public JAXBElement<DeletarParametrizacaoCentroDeCustoRequest> createDeletarParametrizacaoCentroDeCusto(DeletarParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<DeletarParametrizacaoCentroDeCustoRequest>(_DeletarParametrizacaoCentroDeCusto_QNAME, DeletarParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusSubCentroDeCustoResponse")
    public JAXBElement<AlterarStatusSubCentroDeCustoResponse> createAlterarStatusSubCentroDeCustoResponse(AlterarStatusSubCentroDeCustoResponse value) {
        return new JAXBElement<AlterarStatusSubCentroDeCustoResponse>(_AlterarStatusSubCentroDeCustoResponse_QNAME, AlterarStatusSubCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTarifarioResponse")
    public JAXBElement<CadastrarTarifarioResponse> createCadastrarTarifarioResponse(CadastrarTarifarioResponse value) {
        return new JAXBElement<CadastrarTarifarioResponse>(_CadastrarTarifarioResponse_QNAME, CadastrarTarifarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarSubCentroDeCusto")
    public JAXBElement<CadastrarSubCentroDeCustoRequest> createCadastrarSubCentroDeCusto(CadastrarSubCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarSubCentroDeCustoRequest>(_CadastrarSubCentroDeCusto_QNAME, CadastrarSubCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "reprovarSolicitacaoResponse")
    public JAXBElement<ReprovarSolicitacaoResponse> createReprovarSolicitacaoResponse(ReprovarSolicitacaoResponse value) {
        return new JAXBElement<ReprovarSolicitacaoResponse>(_ReprovarSolicitacaoResponse_QNAME, ReprovarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarCentroDeCusto")
    public JAXBElement<CadastrarCentroDeCustoRequest> createCadastrarCentroDeCusto(CadastrarCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarCentroDeCustoRequest>(_CadastrarCentroDeCusto_QNAME, CadastrarCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirItemDespesa")
    public JAXBElement<InserirItemDespesaRequest> createInserirItemDespesa(InserirItemDespesaRequest value) {
        return new JAXBElement<InserirItemDespesaRequest>(_InserirItemDespesa_QNAME, InserirItemDespesaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFuncionario")
    public JAXBElement<CadastrarFuncionarioRequest> createCadastrarFuncionario(CadastrarFuncionarioRequest value) {
        return new JAXBElement<CadastrarFuncionarioRequest>(_CadastrarFuncionario_QNAME, CadastrarFuncionarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusRegionalResponse")
    public JAXBElement<AlterarStatusRegionalResponse> createAlterarStatusRegionalResponse(AlterarStatusRegionalResponse value) {
        return new JAXBElement<AlterarStatusRegionalResponse>(_AlterarStatusRegionalResponse_QNAME, AlterarStatusRegionalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedor")
    public JAXBElement<CadastrarFornecedorRequest> createCadastrarFornecedor(CadastrarFornecedorRequest value) {
        return new JAXBElement<CadastrarFornecedorRequest>(_CadastrarFornecedor_QNAME, CadastrarFornecedorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorSourceResponse")
    public JAXBElement<CadastrarFornecedorSourceResponse> createCadastrarFornecedorSourceResponse(CadastrarFornecedorSourceResponse value) {
        return new JAXBElement<CadastrarFornecedorSourceResponse>(_CadastrarFornecedorSourceResponse_QNAME, CadastrarFornecedorSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarSolicitacaoResponse")
    public JAXBElement<PesquisarSolicitacaoResponse> createPesquisarSolicitacaoResponse(PesquisarSolicitacaoResponse value) {
        return new JAXBElement<PesquisarSolicitacaoResponse>(_PesquisarSolicitacaoResponse_QNAME, PesquisarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "sincronizarSolicitacaoResponse")
    public JAXBElement<SincronizarSolicitacaoResponse> createSincronizarSolicitacaoResponse(SincronizarSolicitacaoResponse value) {
        return new JAXBElement<SincronizarSolicitacaoResponse>(_SincronizarSolicitacaoResponse_QNAME, SincronizarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "aprovarSolicitacaoResponse")
    public JAXBElement<AprovarSolicitacaoResponse> createAprovarSolicitacaoResponse(AprovarSolicitacaoResponse value) {
        return new JAXBElement<AprovarSolicitacaoResponse>(_AprovarSolicitacaoResponse_QNAME, AprovarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoViajante")
    public JAXBElement<DeletarParametrizacaoViajanteRequest> createDeletarParametrizacaoViajante(DeletarParametrizacaoViajanteRequest value) {
        return new JAXBElement<DeletarParametrizacaoViajanteRequest>(_DeletarParametrizacaoViajante_QNAME, DeletarParametrizacaoViajanteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFornecedorResponse")
    public JAXBElement<AlterarStatusFornecedorResponse> createAlterarStatusFornecedorResponse(AlterarStatusFornecedorResponse value) {
        return new JAXBElement<AlterarStatusFornecedorResponse>(_AlterarStatusFornecedorResponse_QNAME, AlterarStatusFornecedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarSolicitacao")
    public JAXBElement<PesquisarSolicitacaoRequest> createPesquisarSolicitacao(PesquisarSolicitacaoRequest value) {
        return new JAXBElement<PesquisarSolicitacaoRequest>(_PesquisarSolicitacao_QNAME, PesquisarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorResponse")
    public JAXBElement<CadastrarFornecedorResponse> createCadastrarFornecedorResponse(CadastrarFornecedorResponse value) {
        return new JAXBElement<CadastrarFornecedorResponse>(_CadastrarFornecedorResponse_QNAME, CadastrarFornecedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirItemDespesaResponse")
    public JAXBElement<InserirItemDespesaResponse> createInserirItemDespesaResponse(InserirItemDespesaResponse value) {
        return new JAXBElement<InserirItemDespesaResponse>(_InserirItemDespesaResponse_QNAME, InserirItemDespesaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoViajanteResponse")
    public JAXBElement<DeletarParametrizacaoViajanteResponse> createDeletarParametrizacaoViajanteResponse(DeletarParametrizacaoViajanteResponse value) {
        return new JAXBElement<DeletarParametrizacaoViajanteResponse>(_DeletarParametrizacaoViajanteResponse_QNAME, DeletarParametrizacaoViajanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "reprovarSolicitacao")
    public JAXBElement<ReprovarSolicitacaoRequest> createReprovarSolicitacao(ReprovarSolicitacaoRequest value) {
        return new JAXBElement<ReprovarSolicitacaoRequest>(_ReprovarSolicitacao_QNAME, ReprovarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoCentroDeCustoResponse")
    public JAXBElement<CadastrarParametrizacaoCentroDeCustoResponse> createCadastrarParametrizacaoCentroDeCustoResponse(CadastrarParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarParametrizacaoCentroDeCustoResponse>(_CadastrarParametrizacaoCentroDeCustoResponse_QNAME, CadastrarParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusContaContabilResponse")
    public JAXBElement<AlterarStatusContaContabilResponse> createAlterarStatusContaContabilResponse(AlterarStatusContaContabilResponse value) {
        return new JAXBElement<AlterarStatusContaContabilResponse>(_AlterarStatusContaContabilResponse_QNAME, AlterarStatusContaContabilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarVendasConsolidadoraResponse")
    public JAXBElement<PesquisarVendasConsolidadoraResponse> createPesquisarVendasConsolidadoraResponse(PesquisarVendasConsolidadoraResponse value) {
        return new JAXBElement<PesquisarVendasConsolidadoraResponse>(_PesquisarVendasConsolidadoraResponse_QNAME, PesquisarVendasConsolidadoraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "userPassword")
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarCentroDeCustoResponse")
    public JAXBElement<CadastrarCentroDeCustoResponse> createCadastrarCentroDeCustoResponse(CadastrarCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarCentroDeCustoResponse>(_CadastrarCentroDeCustoResponse_QNAME, CadastrarCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarContaContabil")
    public JAXBElement<CadastrarContaContabilRequest> createCadastrarContaContabil(CadastrarContaContabilRequest value) {
        return new JAXBElement<CadastrarContaContabilRequest>(_CadastrarContaContabil_QNAME, CadastrarContaContabilRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarContaContabilResponse")
    public JAXBElement<CadastrarContaContabilResponse> createCadastrarContaContabilResponse(CadastrarContaContabilResponse value) {
        return new JAXBElement<CadastrarContaContabilResponse>(_CadastrarContaContabilResponse_QNAME, CadastrarContaContabilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoCentroDeCustoResponse")
    public JAXBElement<DeletarParametrizacaoCentroDeCustoResponse> createDeletarParametrizacaoCentroDeCustoResponse(DeletarParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<DeletarParametrizacaoCentroDeCustoResponse>(_DeletarParametrizacaoCentroDeCustoResponse_QNAME, DeletarParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFornecedor")
    public JAXBElement<AlterarStatusFornecedorRequest> createAlterarStatusFornecedor(AlterarStatusFornecedorRequest value) {
        return new JAXBElement<AlterarStatusFornecedorRequest>(_AlterarStatusFornecedor_QNAME, AlterarStatusFornecedorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoCentroDeCusto")
    public JAXBElement<CadastrarParametrizacaoCentroDeCustoRequest> createCadastrarParametrizacaoCentroDeCusto(CadastrarParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarParametrizacaoCentroDeCustoRequest>(_CadastrarParametrizacaoCentroDeCusto_QNAME, CadastrarParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirIdentificadorIntegracaoResponse")
    public JAXBElement<InserirIdentificadorIntegracaoResponse> createInserirIdentificadorIntegracaoResponse(InserirIdentificadorIntegracaoResponse value) {
        return new JAXBElement<InserirIdentificadorIntegracaoResponse>(_InserirIdentificadorIntegracaoResponse_QNAME, InserirIdentificadorIntegracaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarProjetoResponse")
    public JAXBElement<CadastrarProjetoResponse> createCadastrarProjetoResponse(CadastrarProjetoResponse value) {
        return new JAXBElement<CadastrarProjetoResponse>(_CadastrarProjetoResponse_QNAME, CadastrarProjetoResponse.class, null, value);
    }

}
