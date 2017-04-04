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
 * A representation of the model object '<em><b>Linear Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getGPerSection <em>GPer Section</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensatorPhase()
 * @model
 * @generated
 */
public interface LinearShuntCompensatorPhase extends ShuntCompensatorPhase {
    /**
     * Returns the value of the '<em><b>BPer Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BPer Section</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BPer Section</em>' attribute.
     * @see #isSetBPerSection()
     * @see #unsetBPerSection()
     * @see #setBPerSection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensatorPhase_BPerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensatorPhase.bPerSection' kind='element'"
     * @generated
     */
    Float getBPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getBPerSection <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BPer Section</em>' attribute.
     * @see #isSetBPerSection()
     * @see #unsetBPerSection()
     * @see #getBPerSection()
     * @generated
     */
    void setBPerSection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getBPerSection <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBPerSection()
     * @see #getBPerSection()
     * @see #setBPerSection(Float)
     * @generated
     */
    void unsetBPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getBPerSection <em>BPer Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BPer Section</em>' attribute is set.
     * @see #unsetBPerSection()
     * @see #getBPerSection()
     * @see #setBPerSection(Float)
     * @generated
     */
    boolean isSetBPerSection();

    /**
     * Returns the value of the '<em><b>GPer Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GPer Section</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GPer Section</em>' attribute.
     * @see #isSetGPerSection()
     * @see #unsetGPerSection()
     * @see #setGPerSection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensatorPhase_GPerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensatorPhase.gPerSection' kind='element'"
     * @generated
     */
    Float getGPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getGPerSection <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GPer Section</em>' attribute.
     * @see #isSetGPerSection()
     * @see #unsetGPerSection()
     * @see #getGPerSection()
     * @generated
     */
    void setGPerSection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getGPerSection <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Float)
     * @generated
     */
    void unsetGPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensatorPhase#getGPerSection <em>GPer Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GPer Section</em>' attribute is set.
     * @see #unsetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Float)
     * @generated
     */
    boolean isSetGPerSection();

} // LinearShuntCompensatorPhase
