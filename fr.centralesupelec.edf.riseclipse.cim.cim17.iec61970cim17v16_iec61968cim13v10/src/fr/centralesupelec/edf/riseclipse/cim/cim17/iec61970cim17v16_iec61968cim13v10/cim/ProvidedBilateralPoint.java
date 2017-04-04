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
 * A representation of the model object '<em><b>Provided Bilateral Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint <em>IO Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProvidedBilateralPoint()
 * @model
 * @generated
 */
public interface ProvidedBilateralPoint extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>IO Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getBilateralToIOPoint <em>Bilateral To IO Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IO Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IO Point</em>' reference.
     * @see #isSetIOPoint()
     * @see #unsetIOPoint()
     * @see #setIOPoint(IOPoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProvidedBilateralPoint_IOPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IOPoint#getBilateralToIOPoint
     * @model opposite="BilateralToIOPoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProvidedBilateralPoint.IOPoint' kind='element'"
     * @generated
     */
    IOPoint getIOPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint <em>IO Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IO Point</em>' reference.
     * @see #isSetIOPoint()
     * @see #unsetIOPoint()
     * @see #getIOPoint()
     * @generated
     */
    void setIOPoint( IOPoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint <em>IO Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIOPoint()
     * @see #getIOPoint()
     * @see #setIOPoint(IOPoint)
     * @generated
     */
    void unsetIOPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getIOPoint <em>IO Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>IO Point</em>' reference is set.
     * @see #unsetIOPoint()
     * @see #getIOPoint()
     * @see #setIOPoint(IOPoint)
     * @generated
     */
    boolean isSetIOPoint();

    /**
     * Returns the value of the '<em><b>Bilateral Exchange Actor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProvidedBilateralIOPoint <em>Provided Bilateral IO Point</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProvidedBilateralPoint_BilateralExchangeActor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor#getProvidedBilateralIOPoint
     * @model opposite="ProvidedBilateralIOPoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProvidedBilateralPoint.BilateralExchangeActor' kind='element'"
     * @generated
     */
    BilateralExchangeActor getBilateralExchangeActor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBilateralExchangeActor()
     * @see #getBilateralExchangeActor()
     * @see #setBilateralExchangeActor(BilateralExchangeActor)
     * @generated
     */
    void unsetBilateralExchangeActor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint#getBilateralExchangeActor <em>Bilateral Exchange Actor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bilateral Exchange Actor</em>' reference is set.
     * @see #unsetBilateralExchangeActor()
     * @see #getBilateralExchangeActor()
     * @see #setBilateralExchangeActor(BilateralExchangeActor)
     * @generated
     */
    boolean isSetBilateralExchangeActor();

} // ProvidedBilateralPoint
