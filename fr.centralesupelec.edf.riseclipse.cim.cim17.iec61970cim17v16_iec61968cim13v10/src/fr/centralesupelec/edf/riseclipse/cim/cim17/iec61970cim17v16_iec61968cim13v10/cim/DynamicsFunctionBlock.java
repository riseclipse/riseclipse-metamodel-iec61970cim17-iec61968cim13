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
 * A representation of the model object '<em><b>Dynamics Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDynamicsFunctionBlock()
 * @model
 * @generated
 */
public interface DynamicsFunctionBlock extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #setEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDynamicsFunctionBlock_Enabled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DynamicsFunctionBlock.enabled' kind='element'"
     * @generated
     */
    Boolean getEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @generated
     */
    void setEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    void unsetEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enabled</em>' attribute is set.
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    boolean isSetEnabled();

} // DynamicsFunctionBlock
