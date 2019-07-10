/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Gen Turbine Type2 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenTurbineType2IEC()
 * @model
 * @generated
 */
public interface WindGenTurbineType2IEC extends WindTurbineType1or2IEC {
    /**
     * Returns the value of the '<em><b>Wind Cont Rotor RIEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Rotor RIEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenTurbineType2IEC_WindContRotorRIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC#getWindGenTurbineType2IEC
     * @model opposite="WindGenTurbineType2IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenTurbineType2IEC.WindContRotorRIEC' kind='element'"
     * @generated
     */
    WindContRotorRIEC getWindContRotorRIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @generated
     */
    void setWindContRotorRIEC( WindContRotorRIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    void unsetWindContRotorRIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Rotor RIEC</em>' reference is set.
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    boolean isSetWindContRotorRIEC();

    /**
     * Returns the value of the '<em><b>Wind Pitch Cont Power IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGenTurbineType2IEC_WindPitchContPowerIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC
     * @model opposite="WindGenTurbineType2IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGenTurbineType2IEC.WindPitchContPowerIEC' kind='element'"
     * @generated
     */
    WindPitchContPowerIEC getWindPitchContPowerIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    void unsetWindPitchContPowerIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Pitch Cont Power IEC</em>' reference is set.
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    boolean isSetWindPitchContPowerIEC();

} // WindGenTurbineType2IEC
