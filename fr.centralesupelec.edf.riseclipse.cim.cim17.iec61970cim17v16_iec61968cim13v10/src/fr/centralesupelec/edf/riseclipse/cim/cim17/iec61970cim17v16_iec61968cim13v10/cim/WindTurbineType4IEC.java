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
 * A representation of the model object '<em><b>Wind Turbine Type4 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType4IEC()
 * @model
 * @generated
 */
public interface WindTurbineType4IEC extends WindTurbineType3or4IEC {
    /**
     * Returns the value of the '<em><b>Wind Gen Type3a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Type3a IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Type3a IEC</em>' reference.
     * @see #isSetWindGenType3aIEC()
     * @see #unsetWindGenType3aIEC()
     * @see #setWindGenType3aIEC(WindGenType3aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType4IEC_WindGenType3aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC#getWindTurbineType4IEC
     * @model opposite="WindTurbineType4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType4IEC.WindGenType3aIEC' kind='element'"
     * @generated
     */
    WindGenType3aIEC getWindGenType3aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Type3a IEC</em>' reference.
     * @see #isSetWindGenType3aIEC()
     * @see #unsetWindGenType3aIEC()
     * @see #getWindGenType3aIEC()
     * @generated
     */
    void setWindGenType3aIEC( WindGenType3aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenType3aIEC()
     * @see #getWindGenType3aIEC()
     * @see #setWindGenType3aIEC(WindGenType3aIEC)
     * @generated
     */
    void unsetWindGenType3aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Type3a IEC</em>' reference is set.
     * @see #unsetWindGenType3aIEC()
     * @see #getWindGenType3aIEC()
     * @see #setWindGenType3aIEC(WindGenType3aIEC)
     * @generated
     */
    boolean isSetWindGenType3aIEC();

} // WindTurbineType4IEC
