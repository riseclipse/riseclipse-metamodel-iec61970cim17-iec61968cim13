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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getRemoteUnits <em>Remote Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCommunicationLink()
 * @model
 * @generated
 */
public interface CommunicationLink extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Remote Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Units</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Units</em>' reference list.
     * @see #isSetRemoteUnits()
     * @see #unsetRemoteUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCommunicationLink_RemoteUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getCommunicationLinks
     * @model opposite="CommunicationLinks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CommunicationLink.RemoteUnits' kind='element'"
     * @generated
     */
    EList< RemoteUnit > getRemoteUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getRemoteUnits <em>Remote Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteUnits()
     * @see #getRemoteUnits()
     * @generated
     */
    void unsetRemoteUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getRemoteUnits <em>Remote Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Units</em>' reference list is set.
     * @see #unsetRemoteUnits()
     * @see #getRemoteUnits()
     * @generated
     */
    boolean isSetRemoteUnits();

    /**
     * Returns the value of the '<em><b>Bilateral Exchange Actor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getCommunicationLink <em>Communication Link</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bilateral Exchange Actor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilateral Exchange Actor</em>' reference.
     * @see #isSetBilateralExchangeActor()
     * @see #unsetBilateralExchangeActor()
     * @see #setBilateralExchangeActor(BilateralExchangeActor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCommunicationLink_BilateralExchangeActor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getCommunicationLink
     * @model opposite="CommunicationLink" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CommunicationLink.BilateralExchangeActor' kind='element'"
     * @generated
     */
    BilateralExchangeActor getBilateralExchangeActor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bilateral Exchange Actor</em>' reference.
     * @see #isSetBilateralExchangeActor()
     * @see #unsetBilateralExchangeActor()
     * @see #getBilateralExchangeActor()
     * @generated
     */
    void setBilateralExchangeActor( BilateralExchangeActor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBilateralExchangeActor()
     * @see #getBilateralExchangeActor()
     * @see #setBilateralExchangeActor(BilateralExchangeActor)
     * @generated
     */
    void unsetBilateralExchangeActor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bilateral Exchange Actor</em>' reference is set.
     * @see #unsetBilateralExchangeActor()
     * @see #getBilateralExchangeActor()
     * @see #setBilateralExchangeActor(BilateralExchangeActor)
     * @generated
     */
    boolean isSetBilateralExchangeActor();

} // CommunicationLink
