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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl()
 * @model
 * @generated
 */
public interface TapChangerControl extends RegulatingControl {
    /**
     * Returns the value of the '<em><b>Limit Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limit Voltage</em>' attribute.
     * @see #isSetLimitVoltage()
     * @see #unsetLimitVoltage()
     * @see #setLimitVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_LimitVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.limitVoltage' kind='element'"
     * @generated
     */
    Float getLimitVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Voltage</em>' attribute.
     * @see #isSetLimitVoltage()
     * @see #unsetLimitVoltage()
     * @see #getLimitVoltage()
     * @generated
     */
    void setLimitVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimitVoltage()
     * @see #getLimitVoltage()
     * @see #setLimitVoltage(Float)
     * @generated
     */
    void unsetLimitVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Voltage</em>' attribute is set.
     * @see #unsetLimitVoltage()
     * @see #getLimitVoltage()
     * @see #setLimitVoltage(Float)
     * @generated
     */
    boolean isSetLimitVoltage();

    /**
     * Returns the value of the '<em><b>Line Drop Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Drop Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Drop Compensation</em>' attribute.
     * @see #isSetLineDropCompensation()
     * @see #unsetLineDropCompensation()
     * @see #setLineDropCompensation(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_LineDropCompensation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.lineDropCompensation' kind='element'"
     * @generated
     */
    Boolean getLineDropCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Drop Compensation</em>' attribute.
     * @see #isSetLineDropCompensation()
     * @see #unsetLineDropCompensation()
     * @see #getLineDropCompensation()
     * @generated
     */
    void setLineDropCompensation( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLineDropCompensation()
     * @see #getLineDropCompensation()
     * @see #setLineDropCompensation(Boolean)
     * @generated
     */
    void unsetLineDropCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropCompensation <em>Line Drop Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line Drop Compensation</em>' attribute is set.
     * @see #unsetLineDropCompensation()
     * @see #getLineDropCompensation()
     * @see #setLineDropCompensation(Boolean)
     * @generated
     */
    boolean isSetLineDropCompensation();

    /**
     * Returns the value of the '<em><b>Line Drop R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Drop R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Drop R</em>' attribute.
     * @see #isSetLineDropR()
     * @see #unsetLineDropR()
     * @see #setLineDropR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_LineDropR()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.lineDropR' kind='element'"
     * @generated
     */
    Float getLineDropR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Drop R</em>' attribute.
     * @see #isSetLineDropR()
     * @see #unsetLineDropR()
     * @see #getLineDropR()
     * @generated
     */
    void setLineDropR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLineDropR()
     * @see #getLineDropR()
     * @see #setLineDropR(Float)
     * @generated
     */
    void unsetLineDropR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line Drop R</em>' attribute is set.
     * @see #unsetLineDropR()
     * @see #getLineDropR()
     * @see #setLineDropR(Float)
     * @generated
     */
    boolean isSetLineDropR();

    /**
     * Returns the value of the '<em><b>Line Drop X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Drop X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Drop X</em>' attribute.
     * @see #isSetLineDropX()
     * @see #unsetLineDropX()
     * @see #setLineDropX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_LineDropX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.lineDropX' kind='element'"
     * @generated
     */
    Float getLineDropX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Drop X</em>' attribute.
     * @see #isSetLineDropX()
     * @see #unsetLineDropX()
     * @see #getLineDropX()
     * @generated
     */
    void setLineDropX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLineDropX()
     * @see #getLineDropX()
     * @see #setLineDropX(Float)
     * @generated
     */
    void unsetLineDropX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line Drop X</em>' attribute is set.
     * @see #unsetLineDropX()
     * @see #getLineDropX()
     * @see #setLineDropX(Float)
     * @generated
     */
    boolean isSetLineDropX();

    /**
     * Returns the value of the '<em><b>Reverse Line Drop R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reverse Line Drop R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reverse Line Drop R</em>' attribute.
     * @see #isSetReverseLineDropR()
     * @see #unsetReverseLineDropR()
     * @see #setReverseLineDropR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_ReverseLineDropR()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.reverseLineDropR' kind='element'"
     * @generated
     */
    Float getReverseLineDropR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reverse Line Drop R</em>' attribute.
     * @see #isSetReverseLineDropR()
     * @see #unsetReverseLineDropR()
     * @see #getReverseLineDropR()
     * @generated
     */
    void setReverseLineDropR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReverseLineDropR()
     * @see #getReverseLineDropR()
     * @see #setReverseLineDropR(Float)
     * @generated
     */
    void unsetReverseLineDropR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reverse Line Drop R</em>' attribute is set.
     * @see #unsetReverseLineDropR()
     * @see #getReverseLineDropR()
     * @see #setReverseLineDropR(Float)
     * @generated
     */
    boolean isSetReverseLineDropR();

    /**
     * Returns the value of the '<em><b>Reverse Line Drop X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reverse Line Drop X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reverse Line Drop X</em>' attribute.
     * @see #isSetReverseLineDropX()
     * @see #unsetReverseLineDropX()
     * @see #setReverseLineDropX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_ReverseLineDropX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.reverseLineDropX' kind='element'"
     * @generated
     */
    Float getReverseLineDropX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reverse Line Drop X</em>' attribute.
     * @see #isSetReverseLineDropX()
     * @see #unsetReverseLineDropX()
     * @see #getReverseLineDropX()
     * @generated
     */
    void setReverseLineDropX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReverseLineDropX()
     * @see #getReverseLineDropX()
     * @see #setReverseLineDropX(Float)
     * @generated
     */
    void unsetReverseLineDropX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reverse Line Drop X</em>' attribute is set.
     * @see #unsetReverseLineDropX()
     * @see #getReverseLineDropX()
     * @see #setReverseLineDropX(Float)
     * @generated
     */
    boolean isSetReverseLineDropX();

    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Changer</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Changer</em>' reference list.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerControl_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl
     * @model opposite="TapChangerControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerControl.TapChanger' kind='element'"
     * @generated
     */
    EList< TapChanger > getTapChanger();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    void unsetTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer</em>' reference list is set.
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    boolean isSetTapChanger();

} // TapChangerControl
