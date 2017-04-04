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
 * A representation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingCondEq()
 * @model
 * @generated
 */
public interface RegulatingCondEq extends EnergyConnection {
    /**
     * Returns the value of the '<em><b>Control Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingCondEq_ControlEnabled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingCondEq.controlEnabled' kind='element'"
     * @generated
     */
    Boolean getControlEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @generated
     */
    void setControlEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    void unsetControlEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Enabled</em>' attribute is set.
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    boolean isSetControlEnabled();

    /**
     * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingCondEq_RegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulatingCondEq
     * @model opposite="RegulatingCondEq" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingCondEq.RegulatingControl' kind='element'"
     * @generated
     */
    RegulatingControl getRegulatingControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    void setRegulatingControl( RegulatingControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    void unsetRegulatingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Control</em>' reference is set.
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    boolean isSetRegulatingControl();

} // RegulatingCondEq
