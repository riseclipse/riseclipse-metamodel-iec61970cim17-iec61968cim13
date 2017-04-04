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
 * A representation of the model object '<em><b>Exc ST4B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKim <em>Kim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKir <em>Kir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpr <em>Kpr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getLvgate <em>Lvgate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getThetap <em>Thetap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getUel <em>Uel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVbmax <em>Vbmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVgmax <em>Vgmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmax <em>Vmmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmin <em>Vmmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getXl <em>Xl</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B()
 * @model
 * @generated
 */
public interface ExcST4B extends ExcitationSystemDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kc' kind='element'"
     * @generated
     */
    Float getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKc <em>Kc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Float)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKc <em>Kc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kg</em>' attribute.
     * @see #isSetKg()
     * @see #unsetKg()
     * @see #setKg(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kg()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kg' kind='element'"
     * @generated
     */
    Float getKg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKg <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kg</em>' attribute.
     * @see #isSetKg()
     * @see #unsetKg()
     * @see #getKg()
     * @generated
     */
    void setKg( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKg <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKg()
     * @see #getKg()
     * @see #setKg(Float)
     * @generated
     */
    void unsetKg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKg <em>Kg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kg</em>' attribute is set.
     * @see #unsetKg()
     * @see #getKg()
     * @see #setKg(Float)
     * @generated
     */
    boolean isSetKg();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Ki()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.ki' kind='element'"
     * @generated
     */
    Float getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKi <em>Ki</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Float)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKi <em>Ki</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kim</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kim</em>' attribute.
     * @see #isSetKim()
     * @see #unsetKim()
     * @see #setKim(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kim()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kim' kind='element'"
     * @generated
     */
    Float getKim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKim <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kim</em>' attribute.
     * @see #isSetKim()
     * @see #unsetKim()
     * @see #getKim()
     * @generated
     */
    void setKim( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKim <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKim()
     * @see #getKim()
     * @see #setKim(Float)
     * @generated
     */
    void unsetKim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKim <em>Kim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kim</em>' attribute is set.
     * @see #unsetKim()
     * @see #getKim()
     * @see #setKim(Float)
     * @generated
     */
    boolean isSetKim();

    /**
     * Returns the value of the '<em><b>Kir</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kir</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kir</em>' attribute.
     * @see #isSetKir()
     * @see #unsetKir()
     * @see #setKir(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kir()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kir' kind='element'"
     * @generated
     */
    Float getKir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKir <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kir</em>' attribute.
     * @see #isSetKir()
     * @see #unsetKir()
     * @see #getKir()
     * @generated
     */
    void setKir( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKir <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKir()
     * @see #getKir()
     * @see #setKir(Float)
     * @generated
     */
    void unsetKir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKir <em>Kir</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kir</em>' attribute is set.
     * @see #unsetKir()
     * @see #getKir()
     * @see #setKir(Float)
     * @generated
     */
    boolean isSetKir();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kp' kind='element'"
     * @generated
     */
    Float getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKp <em>Kp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Float)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKp <em>Kp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kpm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpm</em>' attribute.
     * @see #isSetKpm()
     * @see #unsetKpm()
     * @see #setKpm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kpm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kpm' kind='element'"
     * @generated
     */
    Float getKpm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpm <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpm</em>' attribute.
     * @see #isSetKpm()
     * @see #unsetKpm()
     * @see #getKpm()
     * @generated
     */
    void setKpm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpm <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpm()
     * @see #getKpm()
     * @see #setKpm(Float)
     * @generated
     */
    void unsetKpm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpm <em>Kpm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpm</em>' attribute is set.
     * @see #unsetKpm()
     * @see #getKpm()
     * @see #setKpm(Float)
     * @generated
     */
    boolean isSetKpm();

    /**
     * Returns the value of the '<em><b>Kpr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpr</em>' attribute.
     * @see #isSetKpr()
     * @see #unsetKpr()
     * @see #setKpr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Kpr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.kpr' kind='element'"
     * @generated
     */
    Float getKpr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpr <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpr</em>' attribute.
     * @see #isSetKpr()
     * @see #unsetKpr()
     * @see #getKpr()
     * @generated
     */
    void setKpr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpr <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpr()
     * @see #getKpr()
     * @see #setKpr(Float)
     * @generated
     */
    void unsetKpr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getKpr <em>Kpr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpr</em>' attribute is set.
     * @see #unsetKpr()
     * @see #getKpr()
     * @see #setKpr(Float)
     * @generated
     */
    boolean isSetKpr();

    /**
     * Returns the value of the '<em><b>Lvgate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lvgate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lvgate</em>' attribute.
     * @see #isSetLvgate()
     * @see #unsetLvgate()
     * @see #setLvgate(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Lvgate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.lvgate' kind='element'"
     * @generated
     */
    Boolean getLvgate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getLvgate <em>Lvgate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lvgate</em>' attribute.
     * @see #isSetLvgate()
     * @see #unsetLvgate()
     * @see #getLvgate()
     * @generated
     */
    void setLvgate( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getLvgate <em>Lvgate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLvgate()
     * @see #getLvgate()
     * @see #setLvgate(Boolean)
     * @generated
     */
    void unsetLvgate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getLvgate <em>Lvgate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lvgate</em>' attribute is set.
     * @see #unsetLvgate()
     * @see #getLvgate()
     * @see #setLvgate(Boolean)
     * @generated
     */
    boolean isSetLvgate();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Ta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.ta' kind='element'"
     * @generated
     */
    Float getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getTa <em>Ta</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Thetap</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetap</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetap</em>' attribute.
     * @see #isSetThetap()
     * @see #unsetThetap()
     * @see #setThetap(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Thetap()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.thetap' kind='element'"
     * @generated
     */
    Float getThetap();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getThetap <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetap</em>' attribute.
     * @see #isSetThetap()
     * @see #unsetThetap()
     * @see #getThetap()
     * @generated
     */
    void setThetap( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getThetap <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetap()
     * @see #getThetap()
     * @see #setThetap(Float)
     * @generated
     */
    void unsetThetap();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getThetap <em>Thetap</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetap</em>' attribute is set.
     * @see #unsetThetap()
     * @see #getThetap()
     * @see #setThetap(Float)
     * @generated
     */
    boolean isSetThetap();

    /**
     * Returns the value of the '<em><b>Uel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uel</em>' attribute.
     * @see #isSetUel()
     * @see #unsetUel()
     * @see #setUel(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Uel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.uel' kind='element'"
     * @generated
     */
    Boolean getUel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getUel <em>Uel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uel</em>' attribute.
     * @see #isSetUel()
     * @see #unsetUel()
     * @see #getUel()
     * @generated
     */
    void setUel( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getUel <em>Uel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUel()
     * @see #getUel()
     * @see #setUel(Boolean)
     * @generated
     */
    void unsetUel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getUel <em>Uel</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uel</em>' attribute is set.
     * @see #unsetUel()
     * @see #getUel()
     * @see #setUel(Boolean)
     * @generated
     */
    boolean isSetUel();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vbmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vbmax' kind='element'"
     * @generated
     */
    Float getVbmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVbmax <em>Vbmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVbmax <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVbmax()
     * @see #getVbmax()
     * @see #setVbmax(Float)
     * @generated
     */
    void unsetVbmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVbmax <em>Vbmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vgmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vgmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vgmax</em>' attribute.
     * @see #isSetVgmax()
     * @see #unsetVgmax()
     * @see #setVgmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vgmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vgmax' kind='element'"
     * @generated
     */
    Float getVgmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVgmax <em>Vgmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vgmax</em>' attribute.
     * @see #isSetVgmax()
     * @see #unsetVgmax()
     * @see #getVgmax()
     * @generated
     */
    void setVgmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVgmax <em>Vgmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVgmax()
     * @see #getVgmax()
     * @see #setVgmax(Float)
     * @generated
     */
    void unsetVgmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVgmax <em>Vgmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vgmax</em>' attribute is set.
     * @see #unsetVgmax()
     * @see #getVgmax()
     * @see #setVgmax(Float)
     * @generated
     */
    boolean isSetVgmax();

    /**
     * Returns the value of the '<em><b>Vmmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vmmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vmmax</em>' attribute.
     * @see #isSetVmmax()
     * @see #unsetVmmax()
     * @see #setVmmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vmmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vmmax' kind='element'"
     * @generated
     */
    Float getVmmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmax <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmmax</em>' attribute.
     * @see #isSetVmmax()
     * @see #unsetVmmax()
     * @see #getVmmax()
     * @generated
     */
    void setVmmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmax <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmmax()
     * @see #getVmmax()
     * @see #setVmmax(Float)
     * @generated
     */
    void unsetVmmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmax <em>Vmmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmmax</em>' attribute is set.
     * @see #unsetVmmax()
     * @see #getVmmax()
     * @see #setVmmax(Float)
     * @generated
     */
    boolean isSetVmmax();

    /**
     * Returns the value of the '<em><b>Vmmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vmmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vmmin</em>' attribute.
     * @see #isSetVmmin()
     * @see #unsetVmmin()
     * @see #setVmmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vmmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vmmin' kind='element'"
     * @generated
     */
    Float getVmmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmin <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmmin</em>' attribute.
     * @see #isSetVmmin()
     * @see #unsetVmmin()
     * @see #getVmmin()
     * @generated
     */
    void setVmmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmin <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmmin()
     * @see #getVmmin()
     * @see #setVmmin(Float)
     * @generated
     */
    void unsetVmmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVmmin <em>Vmmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmmin</em>' attribute is set.
     * @see #unsetVmmin()
     * @see #getVmmin()
     * @see #setVmmin(Float)
     * @generated
     */
    boolean isSetVmmin();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vrmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vrmax' kind='element'"
     * @generated
     */
    Float getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmax <em>Vrmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Float)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmax <em>Vrmax</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Vrmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.vrmin' kind='element'"
     * @generated
     */
    Float getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmin <em>Vrmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Float)
     * @generated
     */
    boolean isSetVrmin();

    /**
     * Returns the value of the '<em><b>Xl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xl</em>' attribute.
     * @see #isSetXl()
     * @see #unsetXl()
     * @see #setXl(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST4B_Xl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcST4B.xl' kind='element'"
     * @generated
     */
    Float getXl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getXl <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xl</em>' attribute.
     * @see #isSetXl()
     * @see #unsetXl()
     * @see #getXl()
     * @generated
     */
    void setXl( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getXl <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXl()
     * @see #getXl()
     * @see #setXl(Float)
     * @generated
     */
    void unsetXl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B#getXl <em>Xl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xl</em>' attribute is set.
     * @see #unsetXl()
     * @see #getXl()
     * @see #setXl(Float)
     * @generated
     */
    boolean isSetXl();

} // ExcST4B
