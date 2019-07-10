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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getStep <em>Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger()
 * @model
 * @generated
 */
public interface TapChanger extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Control Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_ControlEnabled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.controlEnabled' kind='element'"
     * @generated
     */
    Boolean getControlEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @generated
     */
    void setControlEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    void unsetControlEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Enabled</em>' attribute is set.
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    boolean isSetControlEnabled();

    /**
     * Returns the value of the '<em><b>High Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Step</em>' attribute.
     * @see #isSetHighStep()
     * @see #unsetHighStep()
     * @see #setHighStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_HighStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.highStep' kind='element'"
     * @generated
     */
    Integer getHighStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getHighStep <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Step</em>' attribute.
     * @see #isSetHighStep()
     * @see #unsetHighStep()
     * @see #getHighStep()
     * @generated
     */
    void setHighStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getHighStep <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighStep()
     * @see #getHighStep()
     * @see #setHighStep(Integer)
     * @generated
     */
    void unsetHighStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getHighStep <em>High Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Step</em>' attribute is set.
     * @see #unsetHighStep()
     * @see #getHighStep()
     * @see #setHighStep(Integer)
     * @generated
     */
    boolean isSetHighStep();

    /**
     * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #setInitialDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_InitialDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.initialDelay' kind='element'"
     * @generated
     */
    Float getInitialDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Delay</em>' attribute.
     * @see #isSetInitialDelay()
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @generated
     */
    void setInitialDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(Float)
     * @generated
     */
    void unsetInitialDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Delay</em>' attribute is set.
     * @see #unsetInitialDelay()
     * @see #getInitialDelay()
     * @see #setInitialDelay(Float)
     * @generated
     */
    boolean isSetInitialDelay();

    /**
     * Returns the value of the '<em><b>Low Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Step</em>' attribute.
     * @see #isSetLowStep()
     * @see #unsetLowStep()
     * @see #setLowStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_LowStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.lowStep' kind='element'"
     * @generated
     */
    Integer getLowStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Step</em>' attribute.
     * @see #isSetLowStep()
     * @see #unsetLowStep()
     * @see #getLowStep()
     * @generated
     */
    void setLowStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowStep()
     * @see #getLowStep()
     * @see #setLowStep(Integer)
     * @generated
     */
    void unsetLowStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Step</em>' attribute is set.
     * @see #unsetLowStep()
     * @see #getLowStep()
     * @see #setLowStep(Integer)
     * @generated
     */
    boolean isSetLowStep();

    /**
     * Returns the value of the '<em><b>Ltc Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ltc Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ltc Flag</em>' attribute.
     * @see #isSetLtcFlag()
     * @see #unsetLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_LtcFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.ltcFlag' kind='element'"
     * @generated
     */
    Boolean getLtcFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ltc Flag</em>' attribute.
     * @see #isSetLtcFlag()
     * @see #unsetLtcFlag()
     * @see #getLtcFlag()
     * @generated
     */
    void setLtcFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLtcFlag()
     * @see #getLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @generated
     */
    void unsetLtcFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ltc Flag</em>' attribute is set.
     * @see #unsetLtcFlag()
     * @see #getLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @generated
     */
    boolean isSetLtcFlag();

    /**
     * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Step</em>' attribute.
     * @see #isSetNeutralStep()
     * @see #unsetNeutralStep()
     * @see #setNeutralStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_NeutralStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.neutralStep' kind='element'"
     * @generated
     */
    Integer getNeutralStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Step</em>' attribute.
     * @see #isSetNeutralStep()
     * @see #unsetNeutralStep()
     * @see #getNeutralStep()
     * @generated
     */
    void setNeutralStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStep()
     * @see #getNeutralStep()
     * @see #setNeutralStep(Integer)
     * @generated
     */
    void unsetNeutralStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Step</em>' attribute is set.
     * @see #unsetNeutralStep()
     * @see #getNeutralStep()
     * @see #setNeutralStep(Integer)
     * @generated
     */
    boolean isSetNeutralStep();

    /**
     * Returns the value of the '<em><b>Neutral U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral U</em>' attribute.
     * @see #isSetNeutralU()
     * @see #unsetNeutralU()
     * @see #setNeutralU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_NeutralU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.neutralU' kind='element'"
     * @generated
     */
    Float getNeutralU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral U</em>' attribute.
     * @see #isSetNeutralU()
     * @see #unsetNeutralU()
     * @see #getNeutralU()
     * @generated
     */
    void setNeutralU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralU()
     * @see #getNeutralU()
     * @see #setNeutralU(Float)
     * @generated
     */
    void unsetNeutralU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral U</em>' attribute is set.
     * @see #unsetNeutralU()
     * @see #getNeutralU()
     * @see #setNeutralU(Float)
     * @generated
     */
    boolean isSetNeutralU();

    /**
     * Returns the value of the '<em><b>Normal Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Step</em>' attribute.
     * @see #isSetNormalStep()
     * @see #unsetNormalStep()
     * @see #setNormalStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_NormalStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.normalStep' kind='element'"
     * @generated
     */
    Integer getNormalStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Step</em>' attribute.
     * @see #isSetNormalStep()
     * @see #unsetNormalStep()
     * @see #getNormalStep()
     * @generated
     */
    void setNormalStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalStep()
     * @see #getNormalStep()
     * @see #setNormalStep(Integer)
     * @generated
     */
    void unsetNormalStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Step</em>' attribute is set.
     * @see #unsetNormalStep()
     * @see #getNormalStep()
     * @see #setNormalStep(Integer)
     * @generated
     */
    boolean isSetNormalStep();

    /**
     * Returns the value of the '<em><b>Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step</em>' attribute.
     * @see #isSetStep()
     * @see #unsetStep()
     * @see #setStep(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_Step()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.step' kind='element'"
     * @generated
     */
    Float getStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getStep <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step</em>' attribute.
     * @see #isSetStep()
     * @see #unsetStep()
     * @see #getStep()
     * @generated
     */
    void setStep( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getStep <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStep()
     * @see #getStep()
     * @see #setStep(Float)
     * @generated
     */
    void unsetStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getStep <em>Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step</em>' attribute is set.
     * @see #unsetStep()
     * @see #getStep()
     * @see #setStep(Float)
     * @generated
     */
    boolean isSetStep();

    /**
     * Returns the value of the '<em><b>Subsequent Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subsequent Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subsequent Delay</em>' attribute.
     * @see #isSetSubsequentDelay()
     * @see #unsetSubsequentDelay()
     * @see #setSubsequentDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_SubsequentDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.subsequentDelay' kind='element'"
     * @generated
     */
    Float getSubsequentDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subsequent Delay</em>' attribute.
     * @see #isSetSubsequentDelay()
     * @see #unsetSubsequentDelay()
     * @see #getSubsequentDelay()
     * @generated
     */
    void setSubsequentDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubsequentDelay()
     * @see #getSubsequentDelay()
     * @see #setSubsequentDelay(Float)
     * @generated
     */
    void unsetSubsequentDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subsequent Delay</em>' attribute is set.
     * @see #unsetSubsequentDelay()
     * @see #getSubsequentDelay()
     * @see #setSubsequentDelay(Float)
     * @generated
     */
    boolean isSetSubsequentDelay();

    /**
     * Returns the value of the '<em><b>Sv Tap Step</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Tap Step</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Tap Step</em>' reference.
     * @see #isSetSvTapStep()
     * @see #unsetSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_SvTapStep()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvTapStep#getTapChanger
     * @model opposite="TapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.SvTapStep' kind='element'"
     * @generated
     */
    SvTapStep getSvTapStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Tap Step</em>' reference.
     * @see #isSetSvTapStep()
     * @see #unsetSvTapStep()
     * @see #getSvTapStep()
     * @generated
     */
    void setSvTapStep( SvTapStep value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvTapStep()
     * @see #getSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @generated
     */
    void unsetSvTapStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Tap Step</em>' reference is set.
     * @see #unsetSvTapStep()
     * @see #getSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @generated
     */
    boolean isSetSvTapStep();

    /**
     * Returns the value of the '<em><b>Tap Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Schedules</em>' reference list.
     * @see #isSetTapSchedules()
     * @see #unsetTapSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_TapSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapSchedule#getTapChanger
     * @model opposite="TapChanger" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.TapSchedules' kind='element'"
     * @generated
     */
    EList< TapSchedule > getTapSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapSchedules()
     * @see #getTapSchedules()
     * @generated
     */
    void unsetTapSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Schedules</em>' reference list is set.
     * @see #unsetTapSchedules()
     * @see #getTapSchedules()
     * @generated
     */
    boolean isSetTapSchedules();

    /**
     * Returns the value of the '<em><b>Tap Changer Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Changer Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Changer Control</em>' reference.
     * @see #isSetTapChangerControl()
     * @see #unsetTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChanger_TapChangerControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl#getTapChanger
     * @model opposite="TapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChanger.TapChangerControl' kind='element'"
     * @generated
     */
    TapChangerControl getTapChangerControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer Control</em>' reference.
     * @see #isSetTapChangerControl()
     * @see #unsetTapChangerControl()
     * @see #getTapChangerControl()
     * @generated
     */
    void setTapChangerControl( TapChangerControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChangerControl()
     * @see #getTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @generated
     */
    void unsetTapChangerControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer Control</em>' reference is set.
     * @see #unsetTapChangerControl()
     * @see #getTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @generated
     */
    boolean isSetTapChangerControl();

} // TapChanger
