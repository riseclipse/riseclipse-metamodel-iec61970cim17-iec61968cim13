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
 * A representation of the model object '<em><b>Wind Turbine Type1or2 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType1or2IEC()
 * @model
 * @generated
 */
public interface WindTurbineType1or2IEC extends WindTurbineType1or2Dynamics {
    /**
     * Returns the value of the '<em><b>Wind Mech IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Mech IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType1or2IEC_WindMechIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC#getWindTurbineType1or2IEC
     * @model opposite="WindTurbineType1or2IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType1or2IEC.WindMechIEC' kind='element'"
     * @generated
     */
    WindMechIEC getWindMechIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @generated
     */
    void setWindMechIEC( WindMechIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    void unsetWindMechIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Mech IEC</em>' reference is set.
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    boolean isSetWindMechIEC();

    /**
     * Returns the value of the '<em><b>Wind Protection IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Protection IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType1or2IEC_WindProtectionIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC
     * @model opposite="WindTurbineType1or2IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType1or2IEC.WindProtectionIEC' kind='element'"
     * @generated
     */
    WindProtectionIEC getWindProtectionIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @generated
     */
    void setWindProtectionIEC( WindProtectionIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    void unsetWindProtectionIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Protection IEC</em>' reference is set.
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    boolean isSetWindProtectionIEC();

} // WindTurbineType1or2IEC
