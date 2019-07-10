/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bilateral Exchange Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getCommunicationLink <em>Communication Link</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProviderBilateralExchange <em>Provider Bilateral Exchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProvidedBilateralIOPoint <em>Provided Bilateral IO Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getConsumerBilateralExchange <em>Consumer Bilateral Exchange</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeActor()
 * @model
 * @generated
 */
public interface BilateralExchangeActor extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Communication Link</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Communication Link</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Communication Link</em>' reference list.
     * @see #isSetCommunicationLink()
     * @see #unsetCommunicationLink()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeActor_CommunicationLink()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor
     * @model opposite="BilateralExchangeActor" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeActor.CommunicationLink' kind='element'"
     * @generated
     */
    EList< CommunicationLink > getCommunicationLink();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getCommunicationLink <em>Communication Link</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommunicationLink()
     * @see #getCommunicationLink()
     * @generated
     */
    void unsetCommunicationLink();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getCommunicationLink <em>Communication Link</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Communication Link</em>' reference list is set.
     * @see #unsetCommunicationLink()
     * @see #getCommunicationLink()
     * @generated
     */
    boolean isSetCommunicationLink();

    /**
     * Returns the value of the '<em><b>Provider Bilateral Exchange</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider Bilateral Exchange</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider Bilateral Exchange</em>' reference list.
     * @see #isSetProviderBilateralExchange()
     * @see #unsetProviderBilateralExchange()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeActor_ProviderBilateralExchange()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getProvider
     * @model opposite="Provider" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeActor.ProviderBilateralExchange' kind='element'"
     * @generated
     */
    EList< BilateralExchangeAgreement > getProviderBilateralExchange();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProviderBilateralExchange <em>Provider Bilateral Exchange</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProviderBilateralExchange()
     * @see #getProviderBilateralExchange()
     * @generated
     */
    void unsetProviderBilateralExchange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProviderBilateralExchange <em>Provider Bilateral Exchange</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Provider Bilateral Exchange</em>' reference list is set.
     * @see #unsetProviderBilateralExchange()
     * @see #getProviderBilateralExchange()
     * @generated
     */
    boolean isSetProviderBilateralExchange();

    /**
     * Returns the value of the '<em><b>Provided Bilateral IO Point</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provided Bilateral IO Point</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provided Bilateral IO Point</em>' reference list.
     * @see #isSetProvidedBilateralIOPoint()
     * @see #unsetProvidedBilateralIOPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeActor_ProvidedBilateralIOPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor
     * @model opposite="BilateralExchangeActor" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeActor.ProvidedBilateralIOPoint' kind='element'"
     * @generated
     */
    EList< ProvidedBilateralPoint > getProvidedBilateralIOPoint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProvidedBilateralIOPoint <em>Provided Bilateral IO Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProvidedBilateralIOPoint()
     * @see #getProvidedBilateralIOPoint()
     * @generated
     */
    void unsetProvidedBilateralIOPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProvidedBilateralIOPoint <em>Provided Bilateral IO Point</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Provided Bilateral IO Point</em>' reference list is set.
     * @see #unsetProvidedBilateralIOPoint()
     * @see #getProvidedBilateralIOPoint()
     * @generated
     */
    boolean isSetProvidedBilateralIOPoint();

    /**
     * Returns the value of the '<em><b>Consumer Bilateral Exchange</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer <em>Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumer Bilateral Exchange</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Bilateral Exchange</em>' reference list.
     * @see #isSetConsumerBilateralExchange()
     * @see #unsetConsumerBilateralExchange()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBilateralExchangeActor_ConsumerBilateralExchange()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement#getConsumer
     * @model opposite="Consumer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BilateralExchangeActor.ConsumerBilateralExchange' kind='element'"
     * @generated
     */
    EList< BilateralExchangeAgreement > getConsumerBilateralExchange();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getConsumerBilateralExchange <em>Consumer Bilateral Exchange</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumerBilateralExchange()
     * @see #getConsumerBilateralExchange()
     * @generated
     */
    void unsetConsumerBilateralExchange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getConsumerBilateralExchange <em>Consumer Bilateral Exchange</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumer Bilateral Exchange</em>' reference list is set.
     * @see #unsetConsumerBilateralExchange()
     * @see #getConsumerBilateralExchange()
     * @generated
     */
    boolean isSetConsumerBilateralExchange();

} // BilateralExchangeActor
