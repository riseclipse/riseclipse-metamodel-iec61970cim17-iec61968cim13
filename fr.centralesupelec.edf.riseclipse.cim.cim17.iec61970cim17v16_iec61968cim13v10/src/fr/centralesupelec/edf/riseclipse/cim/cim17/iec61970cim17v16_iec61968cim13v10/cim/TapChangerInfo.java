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
 * A representation of the model object '<em><b>Tap Changer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getBil <em>Bil</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRating <em>Ct Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getIsTcul <em>Is Tcul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo()
 * @model
 * @generated
 */
public interface TapChangerInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Bil</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bil</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bil</em>' attribute.
     * @see #isSetBil()
     * @see #unsetBil()
     * @see #setBil(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_Bil()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.bil' kind='element'"
     * @generated
     */
    Float getBil();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getBil <em>Bil</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bil</em>' attribute.
     * @see #isSetBil()
     * @see #unsetBil()
     * @see #getBil()
     * @generated
     */
    void setBil( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getBil <em>Bil</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBil()
     * @see #getBil()
     * @see #setBil(Float)
     * @generated
     */
    void unsetBil();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getBil <em>Bil</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bil</em>' attribute is set.
     * @see #unsetBil()
     * @see #getBil()
     * @see #setBil(Float)
     * @generated
     */
    boolean isSetBil();

    /**
     * Returns the value of the '<em><b>Ct Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ct Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ct Rating</em>' attribute.
     * @see #isSetCtRating()
     * @see #unsetCtRating()
     * @see #setCtRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_CtRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ctRating' kind='element'"
     * @generated
     */
    Float getCtRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ct Rating</em>' attribute.
     * @see #isSetCtRating()
     * @see #unsetCtRating()
     * @see #getCtRating()
     * @generated
     */
    void setCtRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCtRating()
     * @see #getCtRating()
     * @see #setCtRating(Float)
     * @generated
     */
    void unsetCtRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ct Rating</em>' attribute is set.
     * @see #unsetCtRating()
     * @see #getCtRating()
     * @see #setCtRating(Float)
     * @generated
     */
    boolean isSetCtRating();

    /**
     * Returns the value of the '<em><b>Ct Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ct Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ct Ratio</em>' attribute.
     * @see #isSetCtRatio()
     * @see #unsetCtRatio()
     * @see #setCtRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_CtRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ctRatio' kind='element'"
     * @generated
     */
    Float getCtRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ct Ratio</em>' attribute.
     * @see #isSetCtRatio()
     * @see #unsetCtRatio()
     * @see #getCtRatio()
     * @generated
     */
    void setCtRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCtRatio()
     * @see #getCtRatio()
     * @see #setCtRatio(Float)
     * @generated
     */
    void unsetCtRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ct Ratio</em>' attribute is set.
     * @see #unsetCtRatio()
     * @see #getCtRatio()
     * @see #setCtRatio(Float)
     * @generated
     */
    boolean isSetCtRatio();

    /**
     * Returns the value of the '<em><b>Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Frequency</em>' attribute.
     * @see #isSetFrequency()
     * @see #unsetFrequency()
     * @see #setFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_Frequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.frequency' kind='element'"
     * @generated
     */
    Float getFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Frequency</em>' attribute.
     * @see #isSetFrequency()
     * @see #unsetFrequency()
     * @see #getFrequency()
     * @generated
     */
    void setFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFrequency()
     * @see #getFrequency()
     * @see #setFrequency(Float)
     * @generated
     */
    void unsetFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Frequency</em>' attribute is set.
     * @see #unsetFrequency()
     * @see #getFrequency()
     * @see #setFrequency(Float)
     * @generated
     */
    boolean isSetFrequency();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_HighStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.highStep' kind='element'"
     * @generated
     */
    Integer getHighStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getHighStep <em>High Step</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getHighStep <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighStep()
     * @see #getHighStep()
     * @see #setHighStep(Integer)
     * @generated
     */
    void unsetHighStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getHighStep <em>High Step</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Is Tcul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Tcul</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Tcul</em>' attribute.
     * @see #isSetIsTcul()
     * @see #unsetIsTcul()
     * @see #setIsTcul(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_IsTcul()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.isTcul' kind='element'"
     * @generated
     */
    Boolean getIsTcul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getIsTcul <em>Is Tcul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Tcul</em>' attribute.
     * @see #isSetIsTcul()
     * @see #unsetIsTcul()
     * @see #getIsTcul()
     * @generated
     */
    void setIsTcul( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getIsTcul <em>Is Tcul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsTcul()
     * @see #getIsTcul()
     * @see #setIsTcul(Boolean)
     * @generated
     */
    void unsetIsTcul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getIsTcul <em>Is Tcul</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Tcul</em>' attribute is set.
     * @see #unsetIsTcul()
     * @see #getIsTcul()
     * @see #setIsTcul(Boolean)
     * @generated
     */
    boolean isSetIsTcul();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_LowStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.lowStep' kind='element'"
     * @generated
     */
    Integer getLowStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowStep()
     * @see #getLowStep()
     * @see #setLowStep(Integer)
     * @generated
     */
    void unsetLowStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_NeutralStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.neutralStep' kind='element'"
     * @generated
     */
    Integer getNeutralStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStep()
     * @see #getNeutralStep()
     * @see #setNeutralStep(Integer)
     * @generated
     */
    void unsetNeutralStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_NeutralU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.neutralU' kind='element'"
     * @generated
     */
    Float getNeutralU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralU()
     * @see #getNeutralU()
     * @see #setNeutralU(Float)
     * @generated
     */
    void unsetNeutralU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pt Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pt Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pt Ratio</em>' attribute.
     * @see #isSetPtRatio()
     * @see #unsetPtRatio()
     * @see #setPtRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_PtRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ptRatio' kind='element'"
     * @generated
     */
    Float getPtRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pt Ratio</em>' attribute.
     * @see #isSetPtRatio()
     * @see #unsetPtRatio()
     * @see #getPtRatio()
     * @generated
     */
    void setPtRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPtRatio()
     * @see #getPtRatio()
     * @see #setPtRatio(Float)
     * @generated
     */
    void unsetPtRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pt Ratio</em>' attribute is set.
     * @see #unsetPtRatio()
     * @see #getPtRatio()
     * @see #setPtRatio(Float)
     * @generated
     */
    boolean isSetPtRatio();

    /**
     * Returns the value of the '<em><b>Rated Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Apparent Power</em>' attribute.
     * @see #isSetRatedApparentPower()
     * @see #unsetRatedApparentPower()
     * @see #setRatedApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_RatedApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ratedApparentPower' kind='element'"
     * @generated
     */
    Float getRatedApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Apparent Power</em>' attribute.
     * @see #isSetRatedApparentPower()
     * @see #unsetRatedApparentPower()
     * @see #getRatedApparentPower()
     * @generated
     */
    void setRatedApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedApparentPower()
     * @see #getRatedApparentPower()
     * @see #setRatedApparentPower(Float)
     * @generated
     */
    void unsetRatedApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Apparent Power</em>' attribute is set.
     * @see #unsetRatedApparentPower()
     * @see #getRatedApparentPower()
     * @see #setRatedApparentPower(Float)
     * @generated
     */
    boolean isSetRatedApparentPower();

    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_RatedVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.ratedVoltage' kind='element'"
     * @generated
     */
    Float getRatedVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @generated
     */
    void setRatedVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    void unsetRatedVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    boolean isSetRatedVoltage();

    /**
     * Returns the value of the '<em><b>Step Phase Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step Phase Increment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step Phase Increment</em>' attribute.
     * @see #isSetStepPhaseIncrement()
     * @see #unsetStepPhaseIncrement()
     * @see #setStepPhaseIncrement(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_StepPhaseIncrement()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.stepPhaseIncrement' kind='element'"
     * @generated
     */
    Float getStepPhaseIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Phase Increment</em>' attribute.
     * @see #isSetStepPhaseIncrement()
     * @see #unsetStepPhaseIncrement()
     * @see #getStepPhaseIncrement()
     * @generated
     */
    void setStepPhaseIncrement( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepPhaseIncrement()
     * @see #getStepPhaseIncrement()
     * @see #setStepPhaseIncrement(Float)
     * @generated
     */
    void unsetStepPhaseIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Phase Increment</em>' attribute is set.
     * @see #unsetStepPhaseIncrement()
     * @see #getStepPhaseIncrement()
     * @see #setStepPhaseIncrement(Float)
     * @generated
     */
    boolean isSetStepPhaseIncrement();

    /**
     * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTapChangerInfo_StepVoltageIncrement()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TapChangerInfo.stepVoltageIncrement' kind='element'"
     * @generated
     */
    Float getStepVoltageIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @generated
     */
    void setStepVoltageIncrement( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @generated
     */
    void unsetStepVoltageIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Voltage Increment</em>' attribute is set.
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Float)
     * @generated
     */
    boolean isSetStepVoltageIncrement();

} // TapChangerInfo
