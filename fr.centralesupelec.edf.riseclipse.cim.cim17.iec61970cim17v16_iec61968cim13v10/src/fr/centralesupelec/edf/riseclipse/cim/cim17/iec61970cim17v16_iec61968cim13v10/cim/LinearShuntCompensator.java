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
 * A representation of the model object '<em><b>Linear Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensator()
 * @model
 * @generated
 */
public interface LinearShuntCompensator extends ShuntCompensator {
    /**
     * Returns the value of the '<em><b>B0 Per Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B0 Per Section</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B0 Per Section</em>' attribute.
     * @see #isSetB0PerSection()
     * @see #unsetB0PerSection()
     * @see #setB0PerSection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensator_B0PerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensator.b0PerSection' kind='element'"
     * @generated
     */
    Float getB0PerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0 Per Section</em>' attribute.
     * @see #isSetB0PerSection()
     * @see #unsetB0PerSection()
     * @see #getB0PerSection()
     * @generated
     */
    void setB0PerSection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0PerSection()
     * @see #getB0PerSection()
     * @see #setB0PerSection(Float)
     * @generated
     */
    void unsetB0PerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0 Per Section</em>' attribute is set.
     * @see #unsetB0PerSection()
     * @see #getB0PerSection()
     * @see #setB0PerSection(Float)
     * @generated
     */
    boolean isSetB0PerSection();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensator_BPerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensator.bPerSection' kind='element'"
     * @generated
     */
    Float getBPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBPerSection()
     * @see #getBPerSection()
     * @see #setBPerSection(Float)
     * @generated
     */
    void unsetBPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute is set.
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
     * Returns the value of the '<em><b>G0 Per Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>G0 Per Section</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>G0 Per Section</em>' attribute.
     * @see #isSetG0PerSection()
     * @see #unsetG0PerSection()
     * @see #setG0PerSection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensator_G0PerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensator.g0PerSection' kind='element'"
     * @generated
     */
    Float getG0PerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0 Per Section</em>' attribute.
     * @see #isSetG0PerSection()
     * @see #unsetG0PerSection()
     * @see #getG0PerSection()
     * @generated
     */
    void setG0PerSection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0PerSection()
     * @see #getG0PerSection()
     * @see #setG0PerSection(Float)
     * @generated
     */
    void unsetG0PerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0 Per Section</em>' attribute is set.
     * @see #unsetG0PerSection()
     * @see #getG0PerSection()
     * @see #setG0PerSection(Float)
     * @generated
     */
    boolean isSetG0PerSection();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLinearShuntCompensator_GPerSection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LinearShuntCompensator.gPerSection' kind='element'"
     * @generated
     */
    Float getGPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Float)
     * @generated
     */
    void unsetGPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GPer Section</em>' attribute is set.
     * @see #unsetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Float)
     * @generated
     */
    boolean isSetGPerSection();

} // LinearShuntCompensator
