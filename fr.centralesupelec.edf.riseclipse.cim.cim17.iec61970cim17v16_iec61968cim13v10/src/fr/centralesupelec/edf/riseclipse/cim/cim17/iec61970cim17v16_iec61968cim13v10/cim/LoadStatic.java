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
 * A representation of the model object '<em><b>Load Static</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp1 <em>Ep1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp2 <em>Ep2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp3 <em>Ep3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq1 <em>Eq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq2 <em>Eq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq3 <em>Eq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp1 <em>Kp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp2 <em>Kp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp3 <em>Kp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp4 <em>Kp4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKpf <em>Kpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq1 <em>Kq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq2 <em>Kq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq3 <em>Kq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq4 <em>Kq4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKqf <em>Kqf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic()
 * @model
 * @generated
 */
public interface LoadStatic extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Ep1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ep1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ep1</em>' attribute.
     * @see #isSetEp1()
     * @see #unsetEp1()
     * @see #setEp1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Ep1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.ep1' kind='element'"
     * @generated
     */
    Float getEp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep1</em>' attribute.
     * @see #isSetEp1()
     * @see #unsetEp1()
     * @see #getEp1()
     * @generated
     */
    void setEp1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp1()
     * @see #getEp1()
     * @see #setEp1(Float)
     * @generated
     */
    void unsetEp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep1</em>' attribute is set.
     * @see #unsetEp1()
     * @see #getEp1()
     * @see #setEp1(Float)
     * @generated
     */
    boolean isSetEp1();

    /**
     * Returns the value of the '<em><b>Ep2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ep2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ep2</em>' attribute.
     * @see #isSetEp2()
     * @see #unsetEp2()
     * @see #setEp2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Ep2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.ep2' kind='element'"
     * @generated
     */
    Float getEp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep2</em>' attribute.
     * @see #isSetEp2()
     * @see #unsetEp2()
     * @see #getEp2()
     * @generated
     */
    void setEp2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp2()
     * @see #getEp2()
     * @see #setEp2(Float)
     * @generated
     */
    void unsetEp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep2</em>' attribute is set.
     * @see #unsetEp2()
     * @see #getEp2()
     * @see #setEp2(Float)
     * @generated
     */
    boolean isSetEp2();

    /**
     * Returns the value of the '<em><b>Ep3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ep3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ep3</em>' attribute.
     * @see #isSetEp3()
     * @see #unsetEp3()
     * @see #setEp3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Ep3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.ep3' kind='element'"
     * @generated
     */
    Float getEp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep3</em>' attribute.
     * @see #isSetEp3()
     * @see #unsetEp3()
     * @see #getEp3()
     * @generated
     */
    void setEp3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp3()
     * @see #getEp3()
     * @see #setEp3(Float)
     * @generated
     */
    void unsetEp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep3</em>' attribute is set.
     * @see #unsetEp3()
     * @see #getEp3()
     * @see #setEp3(Float)
     * @generated
     */
    boolean isSetEp3();

    /**
     * Returns the value of the '<em><b>Eq1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq1</em>' attribute.
     * @see #isSetEq1()
     * @see #unsetEq1()
     * @see #setEq1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Eq1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.eq1' kind='element'"
     * @generated
     */
    Float getEq1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq1</em>' attribute.
     * @see #isSetEq1()
     * @see #unsetEq1()
     * @see #getEq1()
     * @generated
     */
    void setEq1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq1()
     * @see #getEq1()
     * @see #setEq1(Float)
     * @generated
     */
    void unsetEq1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq1</em>' attribute is set.
     * @see #unsetEq1()
     * @see #getEq1()
     * @see #setEq1(Float)
     * @generated
     */
    boolean isSetEq1();

    /**
     * Returns the value of the '<em><b>Eq2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq2</em>' attribute.
     * @see #isSetEq2()
     * @see #unsetEq2()
     * @see #setEq2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Eq2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.eq2' kind='element'"
     * @generated
     */
    Float getEq2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq2</em>' attribute.
     * @see #isSetEq2()
     * @see #unsetEq2()
     * @see #getEq2()
     * @generated
     */
    void setEq2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq2()
     * @see #getEq2()
     * @see #setEq2(Float)
     * @generated
     */
    void unsetEq2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq2</em>' attribute is set.
     * @see #unsetEq2()
     * @see #getEq2()
     * @see #setEq2(Float)
     * @generated
     */
    boolean isSetEq2();

    /**
     * Returns the value of the '<em><b>Eq3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq3</em>' attribute.
     * @see #isSetEq3()
     * @see #unsetEq3()
     * @see #setEq3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Eq3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.eq3' kind='element'"
     * @generated
     */
    Float getEq3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq3</em>' attribute.
     * @see #isSetEq3()
     * @see #unsetEq3()
     * @see #getEq3()
     * @generated
     */
    void setEq3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq3()
     * @see #getEq3()
     * @see #setEq3(Float)
     * @generated
     */
    void unsetEq3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq3</em>' attribute is set.
     * @see #unsetEq3()
     * @see #getEq3()
     * @see #setEq3(Float)
     * @generated
     */
    boolean isSetEq3();

    /**
     * Returns the value of the '<em><b>Kp1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kp1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kp1</em>' attribute.
     * @see #isSetKp1()
     * @see #unsetKp1()
     * @see #setKp1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kp1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kp1' kind='element'"
     * @generated
     */
    Float getKp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp1</em>' attribute.
     * @see #isSetKp1()
     * @see #unsetKp1()
     * @see #getKp1()
     * @generated
     */
    void setKp1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp1()
     * @see #getKp1()
     * @see #setKp1(Float)
     * @generated
     */
    void unsetKp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp1</em>' attribute is set.
     * @see #unsetKp1()
     * @see #getKp1()
     * @see #setKp1(Float)
     * @generated
     */
    boolean isSetKp1();

    /**
     * Returns the value of the '<em><b>Kp2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kp2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kp2</em>' attribute.
     * @see #isSetKp2()
     * @see #unsetKp2()
     * @see #setKp2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kp2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kp2' kind='element'"
     * @generated
     */
    Float getKp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp2</em>' attribute.
     * @see #isSetKp2()
     * @see #unsetKp2()
     * @see #getKp2()
     * @generated
     */
    void setKp2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp2()
     * @see #getKp2()
     * @see #setKp2(Float)
     * @generated
     */
    void unsetKp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp2</em>' attribute is set.
     * @see #unsetKp2()
     * @see #getKp2()
     * @see #setKp2(Float)
     * @generated
     */
    boolean isSetKp2();

    /**
     * Returns the value of the '<em><b>Kp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kp3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kp3</em>' attribute.
     * @see #isSetKp3()
     * @see #unsetKp3()
     * @see #setKp3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kp3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kp3' kind='element'"
     * @generated
     */
    Float getKp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp3</em>' attribute.
     * @see #isSetKp3()
     * @see #unsetKp3()
     * @see #getKp3()
     * @generated
     */
    void setKp3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp3()
     * @see #getKp3()
     * @see #setKp3(Float)
     * @generated
     */
    void unsetKp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp3</em>' attribute is set.
     * @see #unsetKp3()
     * @see #getKp3()
     * @see #setKp3(Float)
     * @generated
     */
    boolean isSetKp3();

    /**
     * Returns the value of the '<em><b>Kp4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kp4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kp4</em>' attribute.
     * @see #isSetKp4()
     * @see #unsetKp4()
     * @see #setKp4(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kp4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kp4' kind='element'"
     * @generated
     */
    Float getKp4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp4</em>' attribute.
     * @see #isSetKp4()
     * @see #unsetKp4()
     * @see #getKp4()
     * @generated
     */
    void setKp4( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp4()
     * @see #getKp4()
     * @see #setKp4(Float)
     * @generated
     */
    void unsetKp4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp4</em>' attribute is set.
     * @see #unsetKp4()
     * @see #getKp4()
     * @see #setKp4(Float)
     * @generated
     */
    boolean isSetKp4();

    /**
     * Returns the value of the '<em><b>Kpf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpf</em>' attribute.
     * @see #isSetKpf()
     * @see #unsetKpf()
     * @see #setKpf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kpf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kpf' kind='element'"
     * @generated
     */
    Float getKpf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpf</em>' attribute.
     * @see #isSetKpf()
     * @see #unsetKpf()
     * @see #getKpf()
     * @generated
     */
    void setKpf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpf()
     * @see #getKpf()
     * @see #setKpf(Float)
     * @generated
     */
    void unsetKpf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpf</em>' attribute is set.
     * @see #unsetKpf()
     * @see #getKpf()
     * @see #setKpf(Float)
     * @generated
     */
    boolean isSetKpf();

    /**
     * Returns the value of the '<em><b>Kq1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kq1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kq1</em>' attribute.
     * @see #isSetKq1()
     * @see #unsetKq1()
     * @see #setKq1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kq1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kq1' kind='element'"
     * @generated
     */
    Float getKq1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq1</em>' attribute.
     * @see #isSetKq1()
     * @see #unsetKq1()
     * @see #getKq1()
     * @generated
     */
    void setKq1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq1()
     * @see #getKq1()
     * @see #setKq1(Float)
     * @generated
     */
    void unsetKq1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq1</em>' attribute is set.
     * @see #unsetKq1()
     * @see #getKq1()
     * @see #setKq1(Float)
     * @generated
     */
    boolean isSetKq1();

    /**
     * Returns the value of the '<em><b>Kq2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kq2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kq2</em>' attribute.
     * @see #isSetKq2()
     * @see #unsetKq2()
     * @see #setKq2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kq2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kq2' kind='element'"
     * @generated
     */
    Float getKq2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq2</em>' attribute.
     * @see #isSetKq2()
     * @see #unsetKq2()
     * @see #getKq2()
     * @generated
     */
    void setKq2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq2()
     * @see #getKq2()
     * @see #setKq2(Float)
     * @generated
     */
    void unsetKq2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq2</em>' attribute is set.
     * @see #unsetKq2()
     * @see #getKq2()
     * @see #setKq2(Float)
     * @generated
     */
    boolean isSetKq2();

    /**
     * Returns the value of the '<em><b>Kq3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kq3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kq3</em>' attribute.
     * @see #isSetKq3()
     * @see #unsetKq3()
     * @see #setKq3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kq3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kq3' kind='element'"
     * @generated
     */
    Float getKq3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq3</em>' attribute.
     * @see #isSetKq3()
     * @see #unsetKq3()
     * @see #getKq3()
     * @generated
     */
    void setKq3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq3()
     * @see #getKq3()
     * @see #setKq3(Float)
     * @generated
     */
    void unsetKq3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq3</em>' attribute is set.
     * @see #unsetKq3()
     * @see #getKq3()
     * @see #setKq3(Float)
     * @generated
     */
    boolean isSetKq3();

    /**
     * Returns the value of the '<em><b>Kq4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kq4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kq4</em>' attribute.
     * @see #isSetKq4()
     * @see #unsetKq4()
     * @see #setKq4(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kq4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kq4' kind='element'"
     * @generated
     */
    Float getKq4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq4</em>' attribute.
     * @see #isSetKq4()
     * @see #unsetKq4()
     * @see #getKq4()
     * @generated
     */
    void setKq4( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq4()
     * @see #getKq4()
     * @see #setKq4(Float)
     * @generated
     */
    void unsetKq4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq4</em>' attribute is set.
     * @see #unsetKq4()
     * @see #getKq4()
     * @see #setKq4(Float)
     * @generated
     */
    boolean isSetKq4();

    /**
     * Returns the value of the '<em><b>Kqf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kqf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kqf</em>' attribute.
     * @see #isSetKqf()
     * @see #unsetKqf()
     * @see #setKqf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_Kqf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.kqf' kind='element'"
     * @generated
     */
    Float getKqf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqf</em>' attribute.
     * @see #isSetKqf()
     * @see #unsetKqf()
     * @see #getKqf()
     * @generated
     */
    void setKqf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqf()
     * @see #getKqf()
     * @see #setKqf(Float)
     * @generated
     */
    void unsetKqf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqf</em>' attribute is set.
     * @see #unsetKqf()
     * @see #getKqf()
     * @see #setKqf(Float)
     * @generated
     */
    boolean isSetKqf();

    /**
     * Returns the value of the '<em><b>Static Load Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticLoadModelKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static Load Model Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticLoadModelKind
     * @see #isSetStaticLoadModelType()
     * @see #unsetStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_StaticLoadModelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.staticLoadModelType' kind='element'"
     * @generated
     */
    StaticLoadModelKind getStaticLoadModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticLoadModelKind
     * @see #isSetStaticLoadModelType()
     * @see #unsetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @generated
     */
    void setStaticLoadModelType( StaticLoadModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @generated
     */
    void unsetStaticLoadModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static Load Model Type</em>' attribute is set.
     * @see #unsetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @generated
     */
    boolean isSetStaticLoadModelType();

    /**
     * Returns the value of the '<em><b>Load Aggregate</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Aggregate</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadStatic_LoadAggregate()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic
     * @model opposite="LoadStatic" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadStatic.LoadAggregate' kind='element'"
     * @generated
     */
    LoadAggregate getLoadAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @generated
     */
    void setLoadAggregate( LoadAggregate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    void unsetLoadAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Aggregate</em>' reference is set.
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    boolean isSetLoadAggregate();

} // LoadStatic
