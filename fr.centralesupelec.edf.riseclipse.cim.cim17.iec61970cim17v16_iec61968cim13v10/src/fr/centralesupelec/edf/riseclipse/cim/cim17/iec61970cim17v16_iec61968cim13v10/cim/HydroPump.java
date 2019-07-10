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
 * A representation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump()
 * @model
 * @generated
 */
public interface HydroPump extends Equipment {
    /**
     * Returns the value of the '<em><b>Pump Disch At Max Head</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pump Disch At Max Head</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pump Disch At Max Head</em>' attribute.
     * @see #isSetPumpDischAtMaxHead()
     * @see #unsetPumpDischAtMaxHead()
     * @see #setPumpDischAtMaxHead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_PumpDischAtMaxHead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.pumpDischAtMaxHead' kind='element'"
     * @generated
     */
    Float getPumpDischAtMaxHead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pump Disch At Max Head</em>' attribute.
     * @see #isSetPumpDischAtMaxHead()
     * @see #unsetPumpDischAtMaxHead()
     * @see #getPumpDischAtMaxHead()
     * @generated
     */
    void setPumpDischAtMaxHead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPumpDischAtMaxHead()
     * @see #getPumpDischAtMaxHead()
     * @see #setPumpDischAtMaxHead(Float)
     * @generated
     */
    void unsetPumpDischAtMaxHead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pump Disch At Max Head</em>' attribute is set.
     * @see #unsetPumpDischAtMaxHead()
     * @see #getPumpDischAtMaxHead()
     * @see #setPumpDischAtMaxHead(Float)
     * @generated
     */
    boolean isSetPumpDischAtMaxHead();

    /**
     * Returns the value of the '<em><b>Pump Disch At Min Head</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pump Disch At Min Head</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pump Disch At Min Head</em>' attribute.
     * @see #isSetPumpDischAtMinHead()
     * @see #unsetPumpDischAtMinHead()
     * @see #setPumpDischAtMinHead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_PumpDischAtMinHead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.pumpDischAtMinHead' kind='element'"
     * @generated
     */
    Float getPumpDischAtMinHead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pump Disch At Min Head</em>' attribute.
     * @see #isSetPumpDischAtMinHead()
     * @see #unsetPumpDischAtMinHead()
     * @see #getPumpDischAtMinHead()
     * @generated
     */
    void setPumpDischAtMinHead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPumpDischAtMinHead()
     * @see #getPumpDischAtMinHead()
     * @see #setPumpDischAtMinHead(Float)
     * @generated
     */
    void unsetPumpDischAtMinHead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pump Disch At Min Head</em>' attribute is set.
     * @see #unsetPumpDischAtMinHead()
     * @see #getPumpDischAtMinHead()
     * @see #setPumpDischAtMinHead(Float)
     * @generated
     */
    boolean isSetPumpDischAtMinHead();

    /**
     * Returns the value of the '<em><b>Pump Power At Max Head</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pump Power At Max Head</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pump Power At Max Head</em>' attribute.
     * @see #isSetPumpPowerAtMaxHead()
     * @see #unsetPumpPowerAtMaxHead()
     * @see #setPumpPowerAtMaxHead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_PumpPowerAtMaxHead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.pumpPowerAtMaxHead' kind='element'"
     * @generated
     */
    Float getPumpPowerAtMaxHead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pump Power At Max Head</em>' attribute.
     * @see #isSetPumpPowerAtMaxHead()
     * @see #unsetPumpPowerAtMaxHead()
     * @see #getPumpPowerAtMaxHead()
     * @generated
     */
    void setPumpPowerAtMaxHead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPumpPowerAtMaxHead()
     * @see #getPumpPowerAtMaxHead()
     * @see #setPumpPowerAtMaxHead(Float)
     * @generated
     */
    void unsetPumpPowerAtMaxHead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pump Power At Max Head</em>' attribute is set.
     * @see #unsetPumpPowerAtMaxHead()
     * @see #getPumpPowerAtMaxHead()
     * @see #setPumpPowerAtMaxHead(Float)
     * @generated
     */
    boolean isSetPumpPowerAtMaxHead();

    /**
     * Returns the value of the '<em><b>Pump Power At Min Head</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pump Power At Min Head</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pump Power At Min Head</em>' attribute.
     * @see #isSetPumpPowerAtMinHead()
     * @see #unsetPumpPowerAtMinHead()
     * @see #setPumpPowerAtMinHead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_PumpPowerAtMinHead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.pumpPowerAtMinHead' kind='element'"
     * @generated
     */
    Float getPumpPowerAtMinHead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pump Power At Min Head</em>' attribute.
     * @see #isSetPumpPowerAtMinHead()
     * @see #unsetPumpPowerAtMinHead()
     * @see #getPumpPowerAtMinHead()
     * @generated
     */
    void setPumpPowerAtMinHead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPumpPowerAtMinHead()
     * @see #getPumpPowerAtMinHead()
     * @see #setPumpPowerAtMinHead(Float)
     * @generated
     */
    void unsetPumpPowerAtMinHead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pump Power At Min Head</em>' attribute is set.
     * @see #unsetPumpPowerAtMinHead()
     * @see #getPumpPowerAtMinHead()
     * @see #setPumpPowerAtMinHead(Float)
     * @generated
     */
    boolean isSetPumpPowerAtMinHead();

    /**
     * Returns the value of the '<em><b>Rotating Machine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotating Machine</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotating Machine</em>' reference.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_RotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine#getHydroPump
     * @model opposite="HydroPump" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.RotatingMachine' kind='element'"
     * @generated
     */
    RotatingMachine getRotatingMachine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotating Machine</em>' reference.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    void setRotatingMachine( RotatingMachine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotatingMachine()
     * @see #getRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @generated
     */
    void unsetRotatingMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotating Machine</em>' reference is set.
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @generated
     */
    boolean isSetRotatingMachine();

    /**
     * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_HydroPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPumps
     * @model opposite="HydroPumps" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.HydroPowerPlant' kind='element'"
     * @generated
     */
    HydroPowerPlant getHydroPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @generated
     */
    void setHydroPowerPlant( HydroPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    void unsetHydroPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Power Plant</em>' reference is set.
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    boolean isSetHydroPowerPlant();

    /**
     * Returns the value of the '<em><b>Hydro Pump Op Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Pump Op Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Pump Op Schedule</em>' reference.
     * @see #isSetHydroPumpOpSchedule()
     * @see #unsetHydroPumpOpSchedule()
     * @see #setHydroPumpOpSchedule(HydroPumpOpSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPump_HydroPumpOpSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPumpOpSchedule#getHydroPump
     * @model opposite="HydroPump" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPump.HydroPumpOpSchedule' kind='element'"
     * @generated
     */
    HydroPumpOpSchedule getHydroPumpOpSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Pump Op Schedule</em>' reference.
     * @see #isSetHydroPumpOpSchedule()
     * @see #unsetHydroPumpOpSchedule()
     * @see #getHydroPumpOpSchedule()
     * @generated
     */
    void setHydroPumpOpSchedule( HydroPumpOpSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPumpOpSchedule()
     * @see #getHydroPumpOpSchedule()
     * @see #setHydroPumpOpSchedule(HydroPumpOpSchedule)
     * @generated
     */
    void unsetHydroPumpOpSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Pump Op Schedule</em>' reference is set.
     * @see #unsetHydroPumpOpSchedule()
     * @see #getHydroPumpOpSchedule()
     * @see #setHydroPumpOpSchedule(HydroPumpOpSchedule)
     * @generated
     */
    boolean isSetHydroPumpOpSchedule();

} // HydroPump
