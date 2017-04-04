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

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Due</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getArrears <em>Arrears</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCharges <em>Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getInterest <em>Interest</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getPrinciple <em>Principle</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue()
 * @model
 * @generated
 */
public interface Due extends EObject {
    /**
     * Returns the value of the '<em><b>Arrears</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arrears</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arrears</em>' attribute.
     * @see #isSetArrears()
     * @see #unsetArrears()
     * @see #setArrears(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue_Arrears()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Due.arrears' kind='element'"
     * @generated
     */
    BigDecimal getArrears();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getArrears <em>Arrears</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arrears</em>' attribute.
     * @see #isSetArrears()
     * @see #unsetArrears()
     * @see #getArrears()
     * @generated
     */
    void setArrears( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getArrears <em>Arrears</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArrears()
     * @see #getArrears()
     * @see #setArrears(BigDecimal)
     * @generated
     */
    void unsetArrears();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getArrears <em>Arrears</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Arrears</em>' attribute is set.
     * @see #unsetArrears()
     * @see #getArrears()
     * @see #setArrears(BigDecimal)
     * @generated
     */
    boolean isSetArrears();

    /**
     * Returns the value of the '<em><b>Charges</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Charges</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Charges</em>' attribute.
     * @see #isSetCharges()
     * @see #unsetCharges()
     * @see #setCharges(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue_Charges()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Due.charges' kind='element'"
     * @generated
     */
    BigDecimal getCharges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCharges <em>Charges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charges</em>' attribute.
     * @see #isSetCharges()
     * @see #unsetCharges()
     * @see #getCharges()
     * @generated
     */
    void setCharges( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCharges <em>Charges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCharges()
     * @see #getCharges()
     * @see #setCharges(BigDecimal)
     * @generated
     */
    void unsetCharges();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCharges <em>Charges</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Charges</em>' attribute is set.
     * @see #unsetCharges()
     * @see #getCharges()
     * @see #setCharges(BigDecimal)
     * @generated
     */
    boolean isSetCharges();

    /**
     * Returns the value of the '<em><b>Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current</em>' attribute.
     * @see #isSetCurrent()
     * @see #unsetCurrent()
     * @see #setCurrent(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue_Current()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Due.current' kind='element'"
     * @generated
     */
    BigDecimal getCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCurrent <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current</em>' attribute.
     * @see #isSetCurrent()
     * @see #unsetCurrent()
     * @see #getCurrent()
     * @generated
     */
    void setCurrent( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCurrent <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrent()
     * @see #getCurrent()
     * @see #setCurrent(BigDecimal)
     * @generated
     */
    void unsetCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getCurrent <em>Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current</em>' attribute is set.
     * @see #unsetCurrent()
     * @see #getCurrent()
     * @see #setCurrent(BigDecimal)
     * @generated
     */
    boolean isSetCurrent();

    /**
     * Returns the value of the '<em><b>Interest</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interest</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interest</em>' attribute.
     * @see #isSetInterest()
     * @see #unsetInterest()
     * @see #setInterest(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue_Interest()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Due.interest' kind='element'"
     * @generated
     */
    BigDecimal getInterest();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getInterest <em>Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interest</em>' attribute.
     * @see #isSetInterest()
     * @see #unsetInterest()
     * @see #getInterest()
     * @generated
     */
    void setInterest( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getInterest <em>Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInterest()
     * @see #getInterest()
     * @see #setInterest(BigDecimal)
     * @generated
     */
    void unsetInterest();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getInterest <em>Interest</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interest</em>' attribute is set.
     * @see #unsetInterest()
     * @see #getInterest()
     * @see #setInterest(BigDecimal)
     * @generated
     */
    boolean isSetInterest();

    /**
     * Returns the value of the '<em><b>Principle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Principle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Principle</em>' attribute.
     * @see #isSetPrinciple()
     * @see #unsetPrinciple()
     * @see #setPrinciple(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDue_Principle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Due.principle' kind='element'"
     * @generated
     */
    BigDecimal getPrinciple();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getPrinciple <em>Principle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Principle</em>' attribute.
     * @see #isSetPrinciple()
     * @see #unsetPrinciple()
     * @see #getPrinciple()
     * @generated
     */
    void setPrinciple( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getPrinciple <em>Principle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrinciple()
     * @see #getPrinciple()
     * @see #setPrinciple(BigDecimal)
     * @generated
     */
    void unsetPrinciple();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due#getPrinciple <em>Principle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Principle</em>' attribute is set.
     * @see #unsetPrinciple()
     * @see #getPrinciple()
     * @see #setPrinciple(BigDecimal)
     * @generated
     */
    boolean isSetPrinciple();

} // Due
