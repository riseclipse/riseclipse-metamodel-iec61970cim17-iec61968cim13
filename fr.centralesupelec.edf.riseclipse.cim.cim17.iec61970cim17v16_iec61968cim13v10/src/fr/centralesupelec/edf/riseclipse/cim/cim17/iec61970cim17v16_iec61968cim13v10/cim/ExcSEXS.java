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
 * A representation of the model object '<em><b>Exc SEXS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmax <em>Efdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmin <em>Efdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTatb <em>Tatb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTe <em>Te</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS()
 * @model
 * @generated
 */
public interface ExcSEXS extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Efdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efdmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efdmax</em>' attribute.
     * @see #isSetEfdmax()
     * @see #unsetEfdmax()
     * @see #setEfdmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Efdmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.efdmax' kind='element'"
     * @generated
     */
    Float getEfdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmax <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdmax</em>' attribute.
     * @see #isSetEfdmax()
     * @see #unsetEfdmax()
     * @see #getEfdmax()
     * @generated
     */
    void setEfdmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmax <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Float)
     * @generated
     */
    void unsetEfdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmax <em>Efdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdmax</em>' attribute is set.
     * @see #unsetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Float)
     * @generated
     */
    boolean isSetEfdmax();

    /**
     * Returns the value of the '<em><b>Efdmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efdmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efdmin</em>' attribute.
     * @see #isSetEfdmin()
     * @see #unsetEfdmin()
     * @see #setEfdmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Efdmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.efdmin' kind='element'"
     * @generated
     */
    Float getEfdmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmin <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdmin</em>' attribute.
     * @see #isSetEfdmin()
     * @see #unsetEfdmin()
     * @see #getEfdmin()
     * @generated
     */
    void setEfdmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmin <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmin()
     * @see #getEfdmin()
     * @see #setEfdmin(Float)
     * @generated
     */
    void unsetEfdmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEfdmin <em>Efdmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdmin</em>' attribute is set.
     * @see #unsetEfdmin()
     * @see #getEfdmin()
     * @see #setEfdmin(Float)
     * @generated
     */
    boolean isSetEfdmin();

    /**
     * Returns the value of the '<em><b>Emax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #setEmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Emax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.emax' kind='element'"
     * @generated
     */
    Float getEmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #getEmax()
     * @generated
     */
    void setEmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmax()
     * @see #getEmax()
     * @see #setEmax(Float)
     * @generated
     */
    void unsetEmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmax <em>Emax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emax</em>' attribute is set.
     * @see #unsetEmax()
     * @see #getEmax()
     * @see #setEmax(Float)
     * @generated
     */
    boolean isSetEmax();

    /**
     * Returns the value of the '<em><b>Emin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #setEmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Emin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.emin' kind='element'"
     * @generated
     */
    Float getEmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #getEmin()
     * @generated
     */
    void setEmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmin()
     * @see #getEmin()
     * @see #setEmin(Float)
     * @generated
     */
    void unsetEmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getEmin <em>Emin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emin</em>' attribute is set.
     * @see #unsetEmin()
     * @see #getEmin()
     * @see #setEmin(Float)
     * @generated
     */
    boolean isSetEmin();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>K</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_K()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.k' kind='element'"
     * @generated
     */
    Float getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #getK()
     * @generated
     */
    void setK( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Float)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getK <em>K</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K</em>' attribute is set.
     * @see #unsetK()
     * @see #getK()
     * @see #setK(Float)
     * @generated
     */
    boolean isSetK();

    /**
     * Returns the value of the '<em><b>Kc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #setKc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Kc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.kc' kind='element'"
     * @generated
     */
    Float getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #getKc()
     * @generated
     */
    void setKc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Float)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getKc <em>Kc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kc</em>' attribute is set.
     * @see #unsetKc()
     * @see #getKc()
     * @see #setKc(Float)
     * @generated
     */
    boolean isSetKc();

    /**
     * Returns the value of the '<em><b>Tatb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tatb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tatb</em>' attribute.
     * @see #isSetTatb()
     * @see #unsetTatb()
     * @see #setTatb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Tatb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.tatb' kind='element'"
     * @generated
     */
    Float getTatb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTatb <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tatb</em>' attribute.
     * @see #isSetTatb()
     * @see #unsetTatb()
     * @see #getTatb()
     * @generated
     */
    void setTatb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTatb <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTatb()
     * @see #getTatb()
     * @see #setTatb(Float)
     * @generated
     */
    void unsetTatb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTatb <em>Tatb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tatb</em>' attribute is set.
     * @see #unsetTatb()
     * @see #getTatb()
     * @see #setTatb(Float)
     * @generated
     */
    boolean isSetTatb();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Tb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.tb' kind='element'"
     * @generated
     */
    Float getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    boolean isSetTb();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Tc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.tc' kind='element'"
     * @generated
     */
    Float getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    boolean isSetTc();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSEXS_Te()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSEXS.te' kind='element'"
     * @generated
     */
    Float getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTe <em>Te</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSEXS#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    boolean isSetTe();

} // ExcSEXS
