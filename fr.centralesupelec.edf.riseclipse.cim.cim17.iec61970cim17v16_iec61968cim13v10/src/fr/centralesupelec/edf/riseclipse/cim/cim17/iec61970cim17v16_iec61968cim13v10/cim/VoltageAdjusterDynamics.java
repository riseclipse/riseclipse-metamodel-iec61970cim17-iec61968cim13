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
 * A representation of the model object '<em><b>Voltage Adjuster Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageAdjusterDynamics()
 * @model
 * @generated
 */
public interface VoltageAdjusterDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type1 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics#getVoltageAdjusterDynamics <em>Voltage Adjuster Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageAdjusterDynamics_PFVArControllerType1Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1Dynamics#getVoltageAdjusterDynamics
     * @model opposite="VoltageAdjusterDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VoltageAdjusterDynamics.PFVArControllerType1Dynamics' kind='element'"
     * @generated
     */
    PFVArControllerType1Dynamics getPFVArControllerType1Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @generated
     */
    void setPFVArControllerType1Dynamics( PFVArControllerType1Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    void unsetPFVArControllerType1Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType1Dynamics();

} // VoltageAdjusterDynamics
