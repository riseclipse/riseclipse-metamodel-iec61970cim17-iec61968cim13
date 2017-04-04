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
 * A representation of the model object '<em><b>PFV Ar Type2 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController()
 * @model
 * @generated
 */
public interface PFVArType2IEEEVArController extends PFVArControllerType2Dynamics {
    /**
     * Returns the value of the '<em><b>Exlon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exlon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exlon</em>' attribute.
     * @see #isSetExlon()
     * @see #unsetExlon()
     * @see #setExlon(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Exlon()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.exlon' kind='element'"
     * @generated
     */
    Boolean getExlon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exlon</em>' attribute.
     * @see #isSetExlon()
     * @see #unsetExlon()
     * @see #getExlon()
     * @generated
     */
    void setExlon( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExlon()
     * @see #getExlon()
     * @see #setExlon(Boolean)
     * @generated
     */
    void unsetExlon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exlon</em>' attribute is set.
     * @see #unsetExlon()
     * @see #getExlon()
     * @see #setExlon(Boolean)
     * @generated
     */
    boolean isSetExlon();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ki</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Ki()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.ki' kind='element'"
     * @generated
     */
    Float getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #getKi()
     * @generated
     */
    void setKi( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Float)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki</em>' attribute is set.
     * @see #unsetKi()
     * @see #getKi()
     * @see #setKi(Float)
     * @generated
     */
    boolean isSetKi();

    /**
     * Returns the value of the '<em><b>Kp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Kp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.kp' kind='element'"
     * @generated
     */
    Float getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #getKp()
     * @generated
     */
    void setKp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Float)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp</em>' attribute is set.
     * @see #unsetKp()
     * @see #getKp()
     * @see #setKp(Float)
     * @generated
     */
    boolean isSetKp();

    /**
     * Returns the value of the '<em><b>Qref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qref</em>' attribute.
     * @see #isSetQref()
     * @see #unsetQref()
     * @see #setQref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Qref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.qref' kind='element'"
     * @generated
     */
    Float getQref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qref</em>' attribute.
     * @see #isSetQref()
     * @see #unsetQref()
     * @see #getQref()
     * @generated
     */
    void setQref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQref()
     * @see #getQref()
     * @see #setQref(Float)
     * @generated
     */
    void unsetQref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qref</em>' attribute is set.
     * @see #unsetQref()
     * @see #getQref()
     * @see #setQref(Float)
     * @generated
     */
    boolean isSetQref();

    /**
     * Returns the value of the '<em><b>Vclmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vclmt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vclmt</em>' attribute.
     * @see #isSetVclmt()
     * @see #unsetVclmt()
     * @see #setVclmt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Vclmt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.vclmt' kind='element'"
     * @generated
     */
    Float getVclmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vclmt</em>' attribute.
     * @see #isSetVclmt()
     * @see #unsetVclmt()
     * @see #getVclmt()
     * @generated
     */
    void setVclmt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVclmt()
     * @see #getVclmt()
     * @see #setVclmt(Float)
     * @generated
     */
    void unsetVclmt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vclmt</em>' attribute is set.
     * @see #unsetVclmt()
     * @see #getVclmt()
     * @see #setVclmt(Float)
     * @generated
     */
    boolean isSetVclmt();

    /**
     * Returns the value of the '<em><b>Vref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vref</em>' attribute.
     * @see #isSetVref()
     * @see #unsetVref()
     * @see #setVref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Vref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.vref' kind='element'"
     * @generated
     */
    Float getVref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vref</em>' attribute.
     * @see #isSetVref()
     * @see #unsetVref()
     * @see #getVref()
     * @generated
     */
    void setVref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVref()
     * @see #getVref()
     * @see #setVref(Float)
     * @generated
     */
    void unsetVref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vref</em>' attribute is set.
     * @see #unsetVref()
     * @see #getVref()
     * @see #setVref(Float)
     * @generated
     */
    boolean isSetVref();

    /**
     * Returns the value of the '<em><b>Vs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vs</em>' attribute.
     * @see #isSetVs()
     * @see #unsetVs()
     * @see #setVs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPFVArType2IEEEVArController_Vs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PFVArType2IEEEVArController.vs' kind='element'"
     * @generated
     */
    Float getVs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vs</em>' attribute.
     * @see #isSetVs()
     * @see #unsetVs()
     * @see #getVs()
     * @generated
     */
    void setVs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVs()
     * @see #getVs()
     * @see #setVs(Float)
     * @generated
     */
    void unsetVs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vs</em>' attribute is set.
     * @see #unsetVs()
     * @see #getVs()
     * @see #setVs(Float)
     * @generated
     */
    boolean isSetVs();

} // PFVArType2IEEEVArController
