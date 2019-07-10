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
 * A representation of the model object '<em><b>Asynchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineDynamics()
 * @model
 * @generated
 */
public interface AsynchronousMachineDynamics extends RotatingMachineDynamics {
    /**
     * Returns the value of the '<em><b>Turbine Governor Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Turbine Governor Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Turbine Governor Dynamics</em>' reference.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineDynamics_TurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineDynamics.TurbineGovernorDynamics' kind='element'"
     * @generated
     */
    TurbineGovernorDynamics getTurbineGovernorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Governor Dynamics</em>' reference.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @generated
     */
    void setTurbineGovernorDynamics( TurbineGovernorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    void unsetTurbineGovernorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Governor Dynamics</em>' reference is set.
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    boolean isSetTurbineGovernorDynamics();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference.
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineDynamics_WindTurbineType1or2Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineDynamics.WindTurbineType1or2Dynamics' kind='element'"
     * @generated
     */
    WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference.
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @generated
     */
    void setWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @generated
     */
    void unsetWindTurbineType1or2Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference is set.
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @generated
     */
    boolean isSetWindTurbineType1or2Dynamics();

    /**
     * Returns the value of the '<em><b>Mechanical Load Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mechanical Load Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mechanical Load Dynamics</em>' reference.
     * @see #isSetMechanicalLoadDynamics()
     * @see #unsetMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineDynamics_MechanicalLoadDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineDynamics.MechanicalLoadDynamics' kind='element'"
     * @generated
     */
    MechanicalLoadDynamics getMechanicalLoadDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanical Load Dynamics</em>' reference.
     * @see #isSetMechanicalLoadDynamics()
     * @see #unsetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @generated
     */
    void setMechanicalLoadDynamics( MechanicalLoadDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    void unsetMechanicalLoadDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mechanical Load Dynamics</em>' reference is set.
     * @see #unsetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    boolean isSetMechanicalLoadDynamics();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asynchronous Machine</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asynchronous Machine</em>' reference.
     * @see #isSetAsynchronousMachine()
     * @see #unsetAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineDynamics_AsynchronousMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineDynamics.AsynchronousMachine' kind='element'"
     * @generated
     */
    AsynchronousMachine getAsynchronousMachine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine</em>' reference.
     * @see #isSetAsynchronousMachine()
     * @see #unsetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @generated
     */
    void setAsynchronousMachine( AsynchronousMachine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @generated
     */
    void unsetAsynchronousMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine</em>' reference is set.
     * @see #unsetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @generated
     */
    boolean isSetAsynchronousMachine();

} // AsynchronousMachineDynamics
