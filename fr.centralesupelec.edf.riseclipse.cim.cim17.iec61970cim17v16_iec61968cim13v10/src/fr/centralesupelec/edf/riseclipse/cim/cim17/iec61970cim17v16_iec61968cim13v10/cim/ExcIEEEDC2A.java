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
 * A representation of the model object '<em><b>Exc IEEEDC2A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getExclim <em>Exclim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd1 <em>Seefd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd2 <em>Seefd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getUelin <em>Uelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A()
 * @model
 * @generated
 */
public interface ExcIEEEDC2A extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Efd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efd1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #setEfd1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Efd1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.efd1' kind='element'"
     * @generated
     */
    Float getEfd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @generated
     */
    void setEfd1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Float)
     * @generated
     */
    void unsetEfd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd1 <em>Efd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd1</em>' attribute is set.
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Float)
     * @generated
     */
    boolean isSetEfd1();

    /**
     * Returns the value of the '<em><b>Efd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efd2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #setEfd2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Efd2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.efd2' kind='element'"
     * @generated
     */
    Float getEfd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @generated
     */
    void setEfd2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Float)
     * @generated
     */
    void unsetEfd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getEfd2 <em>Efd2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd2</em>' attribute is set.
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Float)
     * @generated
     */
    boolean isSetEfd2();

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
     * @see #setExclim(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Exclim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.exclim' kind='element'"
     * @generated
     */
    Float getExclim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getExclim <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclim</em>' attribute.
     * @see #isSetExclim()
     * @see #unsetExclim()
     * @see #getExclim()
     * @generated
     */
    void setExclim( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getExclim <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExclim()
     * @see #getExclim()
     * @see #setExclim(Float)
     * @generated
     */
    void unsetExclim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getExclim <em>Exclim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exclim</em>' attribute is set.
     * @see #unsetExclim()
     * @see #getExclim()
     * @see #setExclim(Float)
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Ka()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.ka' kind='element'"
     * @generated
     */
    Float getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKa <em>Ka</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Float)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKa <em>Ka</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Ke()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.ke' kind='element'"
     * @generated
     */
    Float getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKe <em>Ke</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Float)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKe <em>Ke</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Kf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.kf' kind='element'"
     * @generated
     */
    Float getKf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKf <em>Kf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf()
     * @see #getKf()
     * @see #setKf(Float)
     * @generated
     */
    void unsetKf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getKf <em>Kf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Seefd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seefd1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seefd1</em>' attribute.
     * @see #isSetSeefd1()
     * @see #unsetSeefd1()
     * @see #setSeefd1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Seefd1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.seefd1' kind='element'"
     * @generated
     */
    Float getSeefd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd1 <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seefd1</em>' attribute.
     * @see #isSetSeefd1()
     * @see #unsetSeefd1()
     * @see #getSeefd1()
     * @generated
     */
    void setSeefd1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd1 <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeefd1()
     * @see #getSeefd1()
     * @see #setSeefd1(Float)
     * @generated
     */
    void unsetSeefd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd1 <em>Seefd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seefd1</em>' attribute is set.
     * @see #unsetSeefd1()
     * @see #getSeefd1()
     * @see #setSeefd1(Float)
     * @generated
     */
    boolean isSetSeefd1();

    /**
     * Returns the value of the '<em><b>Seefd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seefd2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seefd2</em>' attribute.
     * @see #isSetSeefd2()
     * @see #unsetSeefd2()
     * @see #setSeefd2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Seefd2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.seefd2' kind='element'"
     * @generated
     */
    Float getSeefd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd2 <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seefd2</em>' attribute.
     * @see #isSetSeefd2()
     * @see #unsetSeefd2()
     * @see #getSeefd2()
     * @generated
     */
    void setSeefd2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd2 <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeefd2()
     * @see #getSeefd2()
     * @see #setSeefd2(Float)
     * @generated
     */
    void unsetSeefd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getSeefd2 <em>Seefd2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seefd2</em>' attribute is set.
     * @see #unsetSeefd2()
     * @see #getSeefd2()
     * @see #setSeefd2(Float)
     * @generated
     */
    boolean isSetSeefd2();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Ta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.ta' kind='element'"
     * @generated
     */
    Float getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTa <em>Ta</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Tb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.tb' kind='element'"
     * @generated
     */
    Float getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTb <em>Tb</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Tc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.tc' kind='element'"
     * @generated
     */
    Float getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTc <em>Tc</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Te()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.te' kind='element'"
     * @generated
     */
    Float getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTe <em>Te</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTe <em>Te</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Tf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.tf' kind='element'"
     * @generated
     */
    Float getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTf <em>Tf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Float)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getTf <em>Tf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Uelin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uelin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uelin</em>' attribute.
     * @see #isSetUelin()
     * @see #unsetUelin()
     * @see #setUelin(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Uelin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.uelin' kind='element'"
     * @generated
     */
    Boolean getUelin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getUelin <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uelin</em>' attribute.
     * @see #isSetUelin()
     * @see #unsetUelin()
     * @see #getUelin()
     * @generated
     */
    void setUelin( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getUelin <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUelin()
     * @see #getUelin()
     * @see #setUelin(Boolean)
     * @generated
     */
    void unsetUelin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getUelin <em>Uelin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uelin</em>' attribute is set.
     * @see #unsetUelin()
     * @see #getUelin()
     * @see #setUelin(Boolean)
     * @generated
     */
    boolean isSetUelin();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Vrmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.vrmax' kind='element'"
     * @generated
     */
    Float getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmax <em>Vrmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Float)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmax <em>Vrmax</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcIEEEDC2A_Vrmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcIEEEDC2A.vrmin' kind='element'"
     * @generated
     */
    Float getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmin <em>Vrmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC2A#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    boolean isSetVrmin();

} // ExcIEEEDC2A
