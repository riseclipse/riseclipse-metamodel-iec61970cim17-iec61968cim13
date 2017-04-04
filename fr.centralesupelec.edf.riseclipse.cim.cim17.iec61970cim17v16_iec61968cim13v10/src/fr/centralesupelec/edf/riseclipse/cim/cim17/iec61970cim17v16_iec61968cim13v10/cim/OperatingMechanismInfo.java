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
 * A representation of the model object '<em><b>Operating Mechanism Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseAmps <em>Close Amps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseVoltage <em>Close Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMechanismKind <em>Mechanism Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorRunCurrent <em>Motor Run Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorStartCurrent <em>Motor Start Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorVoltage <em>Motor Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripAmps <em>Trip Amps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripVoltage <em>Trip Voltage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo()
 * @model
 * @generated
 */
public interface OperatingMechanismInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Close Amps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Close Amps</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Close Amps</em>' attribute.
     * @see #isSetCloseAmps()
     * @see #unsetCloseAmps()
     * @see #setCloseAmps(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_CloseAmps()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.closeAmps' kind='element'"
     * @generated
     */
    Float getCloseAmps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseAmps <em>Close Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Close Amps</em>' attribute.
     * @see #isSetCloseAmps()
     * @see #unsetCloseAmps()
     * @see #getCloseAmps()
     * @generated
     */
    void setCloseAmps( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseAmps <em>Close Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCloseAmps()
     * @see #getCloseAmps()
     * @see #setCloseAmps(Float)
     * @generated
     */
    void unsetCloseAmps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseAmps <em>Close Amps</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Close Amps</em>' attribute is set.
     * @see #unsetCloseAmps()
     * @see #getCloseAmps()
     * @see #setCloseAmps(Float)
     * @generated
     */
    boolean isSetCloseAmps();

    /**
     * Returns the value of the '<em><b>Close Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Close Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Close Voltage</em>' attribute.
     * @see #isSetCloseVoltage()
     * @see #unsetCloseVoltage()
     * @see #setCloseVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_CloseVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.closeVoltage' kind='element'"
     * @generated
     */
    Float getCloseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseVoltage <em>Close Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Close Voltage</em>' attribute.
     * @see #isSetCloseVoltage()
     * @see #unsetCloseVoltage()
     * @see #getCloseVoltage()
     * @generated
     */
    void setCloseVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseVoltage <em>Close Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCloseVoltage()
     * @see #getCloseVoltage()
     * @see #setCloseVoltage(Float)
     * @generated
     */
    void unsetCloseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getCloseVoltage <em>Close Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Close Voltage</em>' attribute is set.
     * @see #unsetCloseVoltage()
     * @see #getCloseVoltage()
     * @see #setCloseVoltage(Float)
     * @generated
     */
    boolean isSetCloseVoltage();

    /**
     * Returns the value of the '<em><b>Mechanism Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mechanism Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mechanism Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismKind
     * @see #isSetMechanismKind()
     * @see #unsetMechanismKind()
     * @see #setMechanismKind(OperatingMechanismKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_MechanismKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.mechanismKind' kind='element'"
     * @generated
     */
    OperatingMechanismKind getMechanismKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMechanismKind <em>Mechanism Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanism Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismKind
     * @see #isSetMechanismKind()
     * @see #unsetMechanismKind()
     * @see #getMechanismKind()
     * @generated
     */
    void setMechanismKind( OperatingMechanismKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMechanismKind <em>Mechanism Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMechanismKind()
     * @see #getMechanismKind()
     * @see #setMechanismKind(OperatingMechanismKind)
     * @generated
     */
    void unsetMechanismKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMechanismKind <em>Mechanism Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mechanism Kind</em>' attribute is set.
     * @see #unsetMechanismKind()
     * @see #getMechanismKind()
     * @see #setMechanismKind(OperatingMechanismKind)
     * @generated
     */
    boolean isSetMechanismKind();

    /**
     * Returns the value of the '<em><b>Motor Run Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Motor Run Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Motor Run Current</em>' attribute.
     * @see #isSetMotorRunCurrent()
     * @see #unsetMotorRunCurrent()
     * @see #setMotorRunCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_MotorRunCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.motorRunCurrent' kind='element'"
     * @generated
     */
    Float getMotorRunCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorRunCurrent <em>Motor Run Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Motor Run Current</em>' attribute.
     * @see #isSetMotorRunCurrent()
     * @see #unsetMotorRunCurrent()
     * @see #getMotorRunCurrent()
     * @generated
     */
    void setMotorRunCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorRunCurrent <em>Motor Run Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMotorRunCurrent()
     * @see #getMotorRunCurrent()
     * @see #setMotorRunCurrent(Float)
     * @generated
     */
    void unsetMotorRunCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorRunCurrent <em>Motor Run Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Motor Run Current</em>' attribute is set.
     * @see #unsetMotorRunCurrent()
     * @see #getMotorRunCurrent()
     * @see #setMotorRunCurrent(Float)
     * @generated
     */
    boolean isSetMotorRunCurrent();

    /**
     * Returns the value of the '<em><b>Motor Start Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Motor Start Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Motor Start Current</em>' attribute.
     * @see #isSetMotorStartCurrent()
     * @see #unsetMotorStartCurrent()
     * @see #setMotorStartCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_MotorStartCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.motorStartCurrent' kind='element'"
     * @generated
     */
    Float getMotorStartCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorStartCurrent <em>Motor Start Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Motor Start Current</em>' attribute.
     * @see #isSetMotorStartCurrent()
     * @see #unsetMotorStartCurrent()
     * @see #getMotorStartCurrent()
     * @generated
     */
    void setMotorStartCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorStartCurrent <em>Motor Start Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMotorStartCurrent()
     * @see #getMotorStartCurrent()
     * @see #setMotorStartCurrent(Float)
     * @generated
     */
    void unsetMotorStartCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorStartCurrent <em>Motor Start Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Motor Start Current</em>' attribute is set.
     * @see #unsetMotorStartCurrent()
     * @see #getMotorStartCurrent()
     * @see #setMotorStartCurrent(Float)
     * @generated
     */
    boolean isSetMotorStartCurrent();

    /**
     * Returns the value of the '<em><b>Motor Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Motor Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Motor Voltage</em>' attribute.
     * @see #isSetMotorVoltage()
     * @see #unsetMotorVoltage()
     * @see #setMotorVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_MotorVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.motorVoltage' kind='element'"
     * @generated
     */
    Float getMotorVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorVoltage <em>Motor Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Motor Voltage</em>' attribute.
     * @see #isSetMotorVoltage()
     * @see #unsetMotorVoltage()
     * @see #getMotorVoltage()
     * @generated
     */
    void setMotorVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorVoltage <em>Motor Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMotorVoltage()
     * @see #getMotorVoltage()
     * @see #setMotorVoltage(Float)
     * @generated
     */
    void unsetMotorVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getMotorVoltage <em>Motor Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Motor Voltage</em>' attribute is set.
     * @see #unsetMotorVoltage()
     * @see #getMotorVoltage()
     * @see #setMotorVoltage(Float)
     * @generated
     */
    boolean isSetMotorVoltage();

    /**
     * Returns the value of the '<em><b>Trip Amps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trip Amps</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trip Amps</em>' attribute.
     * @see #isSetTripAmps()
     * @see #unsetTripAmps()
     * @see #setTripAmps(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_TripAmps()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.tripAmps' kind='element'"
     * @generated
     */
    Float getTripAmps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripAmps <em>Trip Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trip Amps</em>' attribute.
     * @see #isSetTripAmps()
     * @see #unsetTripAmps()
     * @see #getTripAmps()
     * @generated
     */
    void setTripAmps( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripAmps <em>Trip Amps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTripAmps()
     * @see #getTripAmps()
     * @see #setTripAmps(Float)
     * @generated
     */
    void unsetTripAmps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripAmps <em>Trip Amps</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trip Amps</em>' attribute is set.
     * @see #unsetTripAmps()
     * @see #getTripAmps()
     * @see #setTripAmps(Float)
     * @generated
     */
    boolean isSetTripAmps();

    /**
     * Returns the value of the '<em><b>Trip Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trip Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trip Voltage</em>' attribute.
     * @see #isSetTripVoltage()
     * @see #unsetTripVoltage()
     * @see #setTripVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismInfo_TripVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperatingMechanismInfo.tripVoltage' kind='element'"
     * @generated
     */
    Float getTripVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripVoltage <em>Trip Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trip Voltage</em>' attribute.
     * @see #isSetTripVoltage()
     * @see #unsetTripVoltage()
     * @see #getTripVoltage()
     * @generated
     */
    void setTripVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripVoltage <em>Trip Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTripVoltage()
     * @see #getTripVoltage()
     * @see #setTripVoltage(Float)
     * @generated
     */
    void unsetTripVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanismInfo#getTripVoltage <em>Trip Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trip Voltage</em>' attribute is set.
     * @see #unsetTripVoltage()
     * @see #getTripVoltage()
     * @see #setTripVoltage(Float)
     * @generated
     */
    boolean isSetTripVoltage();

} // OperatingMechanismInfo
