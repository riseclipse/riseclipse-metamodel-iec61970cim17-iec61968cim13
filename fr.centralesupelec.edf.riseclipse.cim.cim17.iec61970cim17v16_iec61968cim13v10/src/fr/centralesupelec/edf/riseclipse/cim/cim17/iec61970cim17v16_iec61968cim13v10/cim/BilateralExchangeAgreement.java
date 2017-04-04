/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bilateral Exchange Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider <em>Provider</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeAgreement()
 * @model
 * @generated
 */
public interface BilateralExchangeAgreement extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Provider</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProviderBilateralExchange <em>Provider Bilateral Exchange</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' reference.
     * @see #isSetProvider()
     * @see #unsetProvider()
     * @see #setProvider(BilateralExchangeActor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeAgreement_Provider()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProviderBilateralExchange
     * @model opposite="ProviderBilateralExchange" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeAgreement.Provider' kind='element'"
     * @generated
     */
    BilateralExchangeActor getProvider();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' reference.
     * @see #isSetProvider()
     * @see #unsetProvider()
     * @see #getProvider()
     * @generated
     */
    void setProvider( BilateralExchangeActor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProvider()
     * @see #getProvider()
     * @see #setProvider(BilateralExchangeActor)
     * @generated
     */
    void unsetProvider();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider <em>Provider</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Provider</em>' reference is set.
     * @see #unsetProvider()
     * @see #getProvider()
     * @see #setProvider(BilateralExchangeActor)
     * @generated
     */
    boolean isSetProvider();

    /**
     * Returns the value of the '<em><b>Consumer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getConsumerBilateralExchange <em>Consumer Bilateral Exchange</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer</em>' reference.
     * @see #isSetConsumer()
     * @see #unsetConsumer()
     * @see #setConsumer(BilateralExchangeActor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeAgreement_Consumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getConsumerBilateralExchange
     * @model opposite="ConsumerBilateralExchange" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeAgreement.Consumer' kind='element'"
     * @generated
     */
    BilateralExchangeActor getConsumer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer <em>Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer</em>' reference.
     * @see #isSetConsumer()
     * @see #unsetConsumer()
     * @see #getConsumer()
     * @generated
     */
    void setConsumer( BilateralExchangeActor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer <em>Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumer()
     * @see #getConsumer()
     * @see #setConsumer(BilateralExchangeActor)
     * @generated
     */
    void unsetConsumer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer <em>Consumer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumer</em>' reference is set.
     * @see #unsetConsumer()
     * @see #getConsumer()
     * @see #setConsumer(BilateralExchangeActor)
     * @generated
     */
    boolean isSetConsumer();

} // BilateralExchangeAgreement
