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
 * A representation of the model object '<em><b>Energy Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyArea()
 * @model
 * @generated
 */
public interface EnergyArea extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Control Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea <em>Energy Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Area</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #setControlArea(ControlArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyArea_ControlArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea
     * @model opposite="EnergyArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyArea.ControlArea' kind='element'"
     * @generated
     */
    ControlArea getControlArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @generated
     */
    void setControlArea( ControlArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    void unsetControlArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea <em>Control Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area</em>' reference is set.
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    boolean isSetControlArea();

} // EnergyArea
