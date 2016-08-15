
package br.com.lemontech.selfbooking.wsselfbooking.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsSelfBooking", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    br.com.lemontech.selfbooking.wsselfbooking.beans.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.carro.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.outro.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.beans.types.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.services.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.services.request.ObjectFactory.class,
    br.com.lemontech.selfbooking.wsselfbooking.services.response.ObjectFactory.class
})
public interface WsSelfBooking {


    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param pesquisarSolicitacao
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse
     */
    @WebMethod
    @WebResult(name = "pesquisarSolicitacaoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "pesquisarSolicitacaoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/pesquisarSolicitacaoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/pesquisarSolicitacaoResponse")
    public PesquisarSolicitacaoResponse pesquisarSolicitacao(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "pesquisarSolicitacao", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "pesquisarSolicitacao")
        PesquisarSolicitacaoRequest pesquisarSolicitacao);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param sincronizarSolicitacao
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse
     */
    @WebMethod
    @WebResult(name = "sincronizarSolicitacaoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "sincronizarSolicitacaoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/sincronizarSolicitacaoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/sincronizarSolicitacaoResponse")
    public SincronizarSolicitacaoResponse sincronizarSolicitacao(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "sincronizarSolicitacao", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "sincronizarSolicitacao")
        SincronizarSolicitacaoRequest sincronizarSolicitacao);

    /**
     * 
     * @param keyClient
     * @param cadastrarRegional
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarRegionalResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarRegionalResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarRegionalRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarRegionalResponse")
    public CadastrarRegionalResponse cadastrarRegional(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarRegional", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarRegional")
        CadastrarRegionalRequest cadastrarRegional);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param alterarStatusRegional
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusRegionalResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusRegionalResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusRegionalRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusRegionalResponse")
    public AlterarStatusRegionalResponse alterarStatusRegional(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusRegional", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusRegional")
        AlterarStatusRegionalRequest alterarStatusRegional);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarContaContabil
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarContaContabilResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarContaContabilResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarContaContabilRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarContaContabilResponse")
    public CadastrarContaContabilResponse cadastrarContaContabil(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarContaContabil", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarContaContabil")
        CadastrarContaContabilRequest cadastrarContaContabil);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param alterarStatusContaContabil
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusContaContabilResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusContaContabilResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusContaContabilRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusContaContabilResponse")
    public AlterarStatusContaContabilResponse alterarStatusContaContabil(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusContaContabil", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusContaContabil")
        AlterarStatusContaContabilRequest alterarStatusContaContabil);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarCentroDeCusto
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarCentroDeCustoResponse")
    public CadastrarCentroDeCustoResponse cadastrarCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarCentroDeCusto")
        CadastrarCentroDeCustoRequest cadastrarCentroDeCusto);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param alterarStatusCentroDeCusto
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusCentroDeCustoResponse")
    public AlterarStatusCentroDeCustoResponse alterarStatusCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusCentroDeCusto")
        AlterarStatusCentroDeCustoRequest alterarStatusCentroDeCusto);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarSubCentroDeCusto
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarSubCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarSubCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarSubCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarSubCentroDeCustoResponse")
    public CadastrarSubCentroDeCustoResponse cadastrarSubCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarSubCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarSubCentroDeCusto")
        CadastrarSubCentroDeCustoRequest cadastrarSubCentroDeCusto);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param alterarStatusSubCentroDeCusto
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusSubCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusSubCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusSubCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusSubCentroDeCustoResponse")
    public AlterarStatusSubCentroDeCustoResponse alterarStatusSubCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusSubCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusSubCentroDeCusto")
        AlterarStatusSubCentroDeCustoRequest alterarStatusSubCentroDeCusto);

    /**
     * 
     * @param cadastrarParametrizacaoCentroDeCusto
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarParametrizacaoCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarParametrizacaoCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarParametrizacaoCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarParametrizacaoCentroDeCustoResponse")
    public CadastrarParametrizacaoCentroDeCustoResponse cadastrarParametrizacaoCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarParametrizacaoCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarParametrizacaoCentroDeCusto")
        CadastrarParametrizacaoCentroDeCustoRequest cadastrarParametrizacaoCentroDeCusto);

    /**
     * 
     * @param deletarParametrizacaoCentroDeCusto
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse
     */
    @WebMethod
    @WebResult(name = "deletarParametrizacaoCentroDeCustoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "deletarParametrizacaoCentroDeCustoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/deletarParametrizacaoCentroDeCustoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/deletarParametrizacaoCentroDeCustoResponse")
    public DeletarParametrizacaoCentroDeCustoResponse deletarParametrizacaoCentroDeCusto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "deletarParametrizacaoCentroDeCusto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "deletarParametrizacaoCentroDeCusto")
        DeletarParametrizacaoCentroDeCustoRequest deletarParametrizacaoCentroDeCusto);

    /**
     * 
     * @param keyClient
     * @param cadastrarFuncionario
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarFuncionarioResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFuncionarioResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarFuncionarioRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarFuncionarioResponse")
    public CadastrarFuncionarioResponse cadastrarFuncionario(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarFuncionario", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFuncionario")
        CadastrarFuncionarioRequest cadastrarFuncionario);

    /**
     * 
     * @param keyClient
     * @param alterarStatusFuncionario
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusFuncionarioResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusFuncionarioResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusFuncionarioRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusFuncionarioResponse")
    public AlterarStatusFuncionarioResponse alterarStatusFuncionario(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusFuncionario", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusFuncionario")
        AlterarStatusFuncionarioRequest alterarStatusFuncionario);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarFornecedor
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarFornecedorResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFornecedorResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarFornecedorRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarFornecedorResponse")
    public CadastrarFornecedorResponse cadastrarFornecedor(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarFornecedor", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFornecedor")
        CadastrarFornecedorRequest cadastrarFornecedor);

    /**
     * 
     * @param keyClient
     * @param alterarStatusFornecedor
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusFornecedorResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusFornecedorResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusFornecedorRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusFornecedorResponse")
    public AlterarStatusFornecedorResponse alterarStatusFornecedor(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusFornecedor", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusFornecedor")
        AlterarStatusFornecedorRequest alterarStatusFornecedor);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarTarifario
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarTarifarioResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarTarifarioResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarTarifarioRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarTarifarioResponse")
    public CadastrarTarifarioResponse cadastrarTarifario(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarTarifario", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarTarifario")
        CadastrarTarifarioRequest cadastrarTarifario);

    /**
     * 
     * @param keyClient
     * @param alterarStatusTarifario
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusTarifarioResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusTarifarioResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusTarifarioRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/alterarStatusTarifarioResponse")
    public AlterarStatusTarifarioResponse alterarStatusTarifario(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusTarifario", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusTarifario")
        AlterarStatusTarifarioRequest alterarStatusTarifario);

    /**
     * 
     * @param aprovarSolicitacao
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse
     */
    @WebMethod
    @WebResult(name = "aprovarSolicitacaoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "aprovarSolicitacaoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/aprovarSolicitacaoRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/aprovarSolicitacaoResponse")
    public AprovarSolicitacaoResponse aprovarSolicitacao(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "aprovarSolicitacao", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "aprovarSolicitacao")
        AprovarSolicitacaoRequest aprovarSolicitacao);

    /**
     * 
     * @param reprovarSolicitacao
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse
     */
    @WebMethod
    @WebResult(name = "reprovarSolicitacaoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "reprovarSolicitacaoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/reprovarSolicitacaoRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/reprovarSolicitacaoResponse")
    public ReprovarSolicitacaoResponse reprovarSolicitacao(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "reprovarSolicitacao", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "reprovarSolicitacao")
        ReprovarSolicitacaoRequest reprovarSolicitacao);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param inserirIdentificadorIntegracao
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse
     */
    @WebMethod
    @WebResult(name = "inserirIdentificadorIntegracaoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "inserirIdentificadorIntegracaoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/inserirIdentificadorIntegracaoRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/inserirIdentificadorIntegracaoResponse")
    public InserirIdentificadorIntegracaoResponse inserirIdentificadorIntegracao(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "inserirIdentificadorIntegracao", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "inserirIdentificadorIntegracao")
        InserirIdentificadorIntegracaoRequest inserirIdentificadorIntegracao);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param cadastrarParametrizacaoViajante
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarParametrizacaoViajanteResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarParametrizacaoViajanteResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarParametrizacaoViajanteRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarParametrizacaoViajanteResponse")
    public CadastrarParametrizacaoViajanteResponse cadastrarParametrizacaoViajante(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarParametrizacaoViajante", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarParametrizacaoViajante")
        CadastrarParametrizacaoViajanteRequest cadastrarParametrizacaoViajante);

    /**
     * 
     * @param deletarParametrizacaoViajante
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse
     */
    @WebMethod
    @WebResult(name = "deletarParametrizacaoViajanteResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "deletarParametrizacaoViajanteResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/deletarParametrizacaoViajanteRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/deletarParametrizacaoViajanteResponse")
    public DeletarParametrizacaoViajanteResponse deletarParametrizacaoViajante(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "deletarParametrizacaoViajante", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "deletarParametrizacaoViajante")
        DeletarParametrizacaoViajanteRequest deletarParametrizacaoViajante);

    /**
     * 
     * @param pesquisarVendasConsolidadora
     * @param keyClient
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse
     */
    @WebMethod
    @WebResult(name = "pesquisarVendasConsolidadoraResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "pesquisarVendasConsolidadoraResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/pesquisarVendasConsolidadoraRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/pesquisarVendasConsolidadoraResponse")
    public PesquisarVendasConsolidadoraResponse pesquisarVendasConsolidadora(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "pesquisarVendasConsolidadora", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "pesquisarVendasConsolidadora")
        PesquisarVendasConsolidadoraRequest pesquisarVendasConsolidadora);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param cadastrarFornecedorSource
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarFornecedorSourceResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFornecedorSourceResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarFornecedorSourceRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsFornecedores/cadastrarFornecedorSourceResponse")
    public CadastrarFornecedorSourceResponse cadastrarFornecedorSource(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarFornecedorSource", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarFornecedorSource")
        CadastrarFornecedorSourceRequest cadastrarFornecedorSource);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param inserirItemDespesa
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse
     */
    @WebMethod
    @WebResult(name = "inserirItemDespesaResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "inserirItemDespesaResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/inserirItemDespesaRequest", output = "http://lemontech.com.br/selfbooking/fornecedores/services/WsSelfBooking/inserirItemDespesaResponse")
    public InserirItemDespesaResponse inserirItemDespesa(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "inserirItemDespesa", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "inserirItemDespesa")
        InserirItemDespesaRequest inserirItemDespesa);

    /**
     * 
     * @param keyClient
     * @param cadastrarProjeto
     * @param userPassword
     * @param userName
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse
     */
    @WebMethod
    @WebResult(name = "cadastrarProjetoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarProjetoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarProjetoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/cadastrarProjetoResponse")
    public CadastrarProjetoResponse cadastrarProjeto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "cadastrarProjeto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "cadastrarProjeto")
        CadastrarProjetoRequest cadastrarProjeto);

    /**
     * 
     * @param keyClient
     * @param userPassword
     * @param userName
     * @param alterarStatusProjeto
     * @return
     *     returns br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse
     */
    @WebMethod
    @WebResult(name = "alterarStatusProjetoResponse", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusProjetoResponse")
    @Action(input = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking//alterarStatusProjetoRequest", output = "http://lemontech.com.br/selfbooking/wsselfbooking/services/WsSelfBooking/alterarStatusProjetoResponse")
    public AlterarStatusProjetoResponse alterarStatusProjeto(
        @WebParam(name = "keyClient", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "keyClient")
        String keyClient,
        @WebParam(name = "userName", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userName")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", header = true, partName = "userPassword")
        String userPassword,
        @WebParam(name = "alterarStatusProjeto", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", partName = "alterarStatusProjeto")
        AlterarStatusProjetoRequest alterarStatusProjeto);

}
