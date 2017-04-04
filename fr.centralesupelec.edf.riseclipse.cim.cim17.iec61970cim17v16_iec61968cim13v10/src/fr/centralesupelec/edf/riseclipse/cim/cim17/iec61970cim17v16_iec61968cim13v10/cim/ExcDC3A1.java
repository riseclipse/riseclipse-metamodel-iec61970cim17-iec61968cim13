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
 * A representation of the model object '<em><b>Exc DC3A1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getExclim <em>Exclim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVb1max <em>Vb1max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVblim <em>Vblim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVbmax <em>Vbmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1()
 * @model
 * @generated
 */
public interface ExcDC3A1 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Exclim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclim</em>' attribute.
     * @see #isSetExclim()
     * @see #unsetExclim()
     * @see #setExclim(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Exclim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.exclim' kind='element'"
     * @generated
     */
    Boolean getExclim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getExclim <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclim</em>' attribute.
     * @see #isSetExclim()
     * @see #unsetExclim()
     * @see #getExclim()
     * @generated
     */
    void setExclim( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getExclim <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExclim()
     * @see #getExclim()
     * @see #setExclim(Boolean)
     * @generated
     */
    void unsetExclim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getExclim <em>Exclim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exclim</em>' attribute is set.
     * @see #unsetExclim()
     * @see #getExclim()
     * @see #setExclim(Boolean)
     * @generated
     */
    boolean isSetExclim();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ka</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Ka()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.ka' kind='element'"
     * @generated
     */
    Float getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Float)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Float)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ke</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Ke()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.ke' kind='element'"
     * @generated
     */
    Float getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #getKe()
     * @generated
     */
    void setKe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Float)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Float)
     * @generated
     */
    boolean isSetKe();

    /**
     * Returns the value of the '<em><b>Kf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #setKf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Kf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.kf' kind='element'"
     * @generated
     */
    Float getKf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #getKf()
     * @generated
     */
    void setKf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf()
     * @see #getKf()
     * @see #setKf(Float)
     * @generated
     */
    void unsetKf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKf <em>Kf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf</em>' attribute is set.
     * @see #unsetKf()
     * @see #getKf()
     * @see #setKf(Float)
     * @generated
     */
    boolean isSetKf();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Ki()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.ki' kind='element'"
     * @generated
     */
    Float getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKi <em>Ki</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Float)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKi <em>Ki</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Kp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.kp' kind='element'"
     * @generated
     */
    Float getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKp <em>Kp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Float)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getKp <em>Kp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Ta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.ta' kind='element'"
     * @generated
     */
    Float getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #getTa()
     * @generated
     */
    void setTa( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTa <em>Ta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ta</em>' attribute is set.
     * @see #unsetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    boolean isSetTa();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Te</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Te()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.te' kind='element'"
     * @generated
     */
    Float getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    boolean isSetTe();

    /**
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Tf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.tf' kind='element'"
     * @generated
     */
    Float getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #getTf()
     * @generated
     */
    void setTf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Float)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getTf <em>Tf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf</em>' attribute is set.
     * @see #unsetTf()
     * @see #getTf()
     * @see #setTf(Float)
     * @generated
     */
    boolean isSetTf();

    /**
     * Returns the value of the '<em><b>Vb1max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vb1max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vb1max</em>' attribute.
     * @see #isSetVb1max()
     * @see #unsetVb1max()
     * @see #setVb1max(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Vb1max()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.vb1max' kind='element'"
     * @generated
     */
    Float getVb1max();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVb1max <em>Vb1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vb1max</em>' attribute.
     * @see #isSetVb1max()
     * @see #unsetVb1max()
     * @see #getVb1max()
     * @generated
     */
    void setVb1max( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVb1max <em>Vb1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVb1max()
     * @see #getVb1max()
     * @see #setVb1max(Float)
     * @generated
     */
    void unsetVb1max();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVb1max <em>Vb1max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vb1max</em>' attribute is set.
     * @see #unsetVb1max()
     * @see #getVb1max()
     * @see #setVb1max(Float)
     * @generated
     */
    boolean isSetVb1max();

    /**
     * Returns the value of the '<em><b>Vblim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vblim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vblim</em>' attribute.
     * @see #isSetVblim()
     * @see #unsetVblim()
     * @see #setVblim(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Vblim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.vblim' kind='element'"
     * @generated
     */
    Boolean getVblim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVblim <em>Vblim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vblim</em>' attribute.
     * @see #isSetVblim()
     * @see #unsetVblim()
     * @see #getVblim()
     * @generated
     */
    void setVblim( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVblim <em>Vblim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVblim()
     * @see #getVblim()
     * @see #setVblim(Boolean)
     * @generated
     */
    void unsetVblim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVblim <em>Vblim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vblim</em>' attribute is set.
     * @see #unsetVblim()
     * @see #getVblim()
     * @see #setVblim(Boolean)
     * @generated
     */
    boolean isSetVblim();

    /**
     * Returns the value of the '<em><b>Vbmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vbmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vbmax</em>' attribute.
     * @see #isSetVbmax()
     * @see #unsetVbmax()
     * @see #setVbmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Vbmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.vbmax' kind='element'"
     * @generated
     */
    Float getVbmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVbmax <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vbmax</em>' attribute.
     * @see #isSetVbmax()
     * @see #unsetVbmax()
     * @see #getVbmax()
     * @generated
     */
    void setVbmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVbmax <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVbmax()
     * @see #getVbmax()
     * @see #setVbmax(Float)
     * @generated
     */
    void unsetVbmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVbmax <em>Vbmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vbmax</em>' attribute is set.
     * @see #unsetVbmax()
     * @see #getVbmax()
     * @see #setVbmax(Float)
     * @generated
     */
    boolean isSetVbmax();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vrmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Vrmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.vrmax' kind='element'"
     * @generated
     */
    Float getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @generated
     */
    void setVrmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Float)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Float)
     * @generated
     */
    boolean isSetVrmax();

    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vrmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcDC3A1_Vrmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcDC3A1.vrmin' kind='element'"
     * @generated
     */
    Float getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @generated
     */
    void setVrmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcDC3A1#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    boolean isSetVrmin();

} // ExcDC3A1
