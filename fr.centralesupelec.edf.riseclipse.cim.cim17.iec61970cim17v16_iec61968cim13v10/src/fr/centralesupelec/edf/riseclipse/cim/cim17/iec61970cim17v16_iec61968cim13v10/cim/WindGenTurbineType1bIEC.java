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
 * A representation of the model object '<em><b>Wind Gen Turbine Type1b IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenTurbineType1bIEC()
 * @model
 * @generated
 */
public interface WindGenTurbineType1bIEC extends WindTurbineType1or2IEC {
    /**
     * Returns the value of the '<em><b>Wind Pitch Cont Power IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Pitch Cont Power IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenTurbineType1bIEC_WindPitchContPowerIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC
     * @model opposite="WindGenTurbineType1bIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenTurbineType1bIEC.WindPitchContPowerIEC' kind='element'"
     * @generated
     */
    WindPitchContPowerIEC getWindPitchContPowerIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @generated
     */
    void setWindPitchContPowerIEC( WindPitchContPowerIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    void unsetWindPitchContPowerIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Pitch Cont Power IEC</em>' reference is set.
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    boolean isSetWindPitchContPowerIEC();

} // WindGenTurbineType1bIEC
