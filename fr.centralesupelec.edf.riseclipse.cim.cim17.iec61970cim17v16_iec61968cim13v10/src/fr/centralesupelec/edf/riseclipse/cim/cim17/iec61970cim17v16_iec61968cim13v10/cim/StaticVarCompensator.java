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
 * A representation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSlope <em>Slope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator()
 * @model
 * @generated
 */
public interface StaticVarCompensator extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacitive Rating</em>' attribute.
     * @see #isSetCapacitiveRating()
     * @see #unsetCapacitiveRating()
     * @see #setCapacitiveRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_CapacitiveRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.capacitiveRating' kind='element'"
     * @generated
     */
    Float getCapacitiveRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
     * @see #isSetCapacitiveRating()
     * @see #unsetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @generated
     */
    void setCapacitiveRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @see #setCapacitiveRating(Float)
     * @generated
     */
    void unsetCapacitiveRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capacitive Rating</em>' attribute is set.
     * @see #unsetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @see #setCapacitiveRating(Float)
     * @generated
     */
    boolean isSetCapacitiveRating();

    /**
     * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inductive Rating</em>' attribute.
     * @see #isSetInductiveRating()
     * @see #unsetInductiveRating()
     * @see #setInductiveRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_InductiveRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.inductiveRating' kind='element'"
     * @generated
     */
    Float getInductiveRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inductive Rating</em>' attribute.
     * @see #isSetInductiveRating()
     * @see #unsetInductiveRating()
     * @see #getInductiveRating()
     * @generated
     */
    void setInductiveRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInductiveRating()
     * @see #getInductiveRating()
     * @see #setInductiveRating(Float)
     * @generated
     */
    void unsetInductiveRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inductive Rating</em>' attribute is set.
     * @see #unsetInductiveRating()
     * @see #getInductiveRating()
     * @see #setInductiveRating(Float)
     * @generated
     */
    boolean isSetInductiveRating();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_Q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.q' kind='element'"
     * @generated
     */
    Float getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>Slope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slope</em>' attribute.
     * @see #isSetSlope()
     * @see #unsetSlope()
     * @see #setSlope(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_Slope()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.slope' kind='element'"
     * @generated
     */
    Float getSlope();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slope</em>' attribute.
     * @see #isSetSlope()
     * @see #unsetSlope()
     * @see #getSlope()
     * @generated
     */
    void setSlope( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSlope()
     * @see #getSlope()
     * @see #setSlope(Float)
     * @generated
     */
    void unsetSlope();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Slope</em>' attribute is set.
     * @see #unsetSlope()
     * @see #getSlope()
     * @see #setSlope(Float)
     * @generated
     */
    boolean isSetSlope();

    /**
     * Returns the value of the '<em><b>SVC Control Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SVCControlMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SVC Control Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SVC Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SVCControlMode
     * @see #isSetSVCControlMode()
     * @see #unsetSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_SVCControlMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.sVCControlMode' kind='element'"
     * @generated
     */
    SVCControlMode getSVCControlMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SVC Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SVCControlMode
     * @see #isSetSVCControlMode()
     * @see #unsetSVCControlMode()
     * @see #getSVCControlMode()
     * @generated
     */
    void setSVCControlMode( SVCControlMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSVCControlMode()
     * @see #getSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @generated
     */
    void unsetSVCControlMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SVC Control Mode</em>' attribute is set.
     * @see #unsetSVCControlMode()
     * @see #getSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @generated
     */
    boolean isSetSVCControlMode();

    /**
     * Returns the value of the '<em><b>Voltage Set Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Set Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Set Point</em>' attribute.
     * @see #isSetVoltageSetPoint()
     * @see #unsetVoltageSetPoint()
     * @see #setVoltageSetPoint(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStaticVarCompensator_VoltageSetPoint()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StaticVarCompensator.voltageSetPoint' kind='element'"
     * @generated
     */
    Float getVoltageSetPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Set Point</em>' attribute.
     * @see #isSetVoltageSetPoint()
     * @see #unsetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @generated
     */
    void setVoltageSetPoint( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @see #setVoltageSetPoint(Float)
     * @generated
     */
    void unsetVoltageSetPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Set Point</em>' attribute is set.
     * @see #unsetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @see #setVoltageSetPoint(Float)
     * @generated
     */
    boolean isSetVoltageSetPoint();

} // StaticVarCompensator
