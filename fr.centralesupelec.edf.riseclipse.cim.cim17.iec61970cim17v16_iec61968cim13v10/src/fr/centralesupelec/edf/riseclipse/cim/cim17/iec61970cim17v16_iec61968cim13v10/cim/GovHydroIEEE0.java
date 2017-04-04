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
 * A representation of the model object '<em><b>Gov Hydro IEEE0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT4 <em>T4</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0()
 * @model
 * @generated
 */
public interface GovHydroIEEE0 extends TurbineGovernorDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_K()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.k' kind='element'"
     * @generated
     */
    Float getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getK <em>K</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Float)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getK <em>K</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mwbase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_Mwbase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.mwbase' kind='element'"
     * @generated
     */
    Float getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @generated
     */
    void setMwbase( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    boolean isSetMwbase();

    /**
     * Returns the value of the '<em><b>Pmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #setPmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_Pmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.pmax' kind='element'"
     * @generated
     */
    Float getPmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #getPmax()
     * @generated
     */
    void setPmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmax()
     * @see #getPmax()
     * @see #setPmax(Float)
     * @generated
     */
    void unsetPmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmax <em>Pmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmax</em>' attribute is set.
     * @see #unsetPmax()
     * @see #getPmax()
     * @see #setPmax(Float)
     * @generated
     */
    boolean isSetPmax();

    /**
     * Returns the value of the '<em><b>Pmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_Pmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.pmin' kind='element'"
     * @generated
     */
    Float getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #getPmin()
     * @generated
     */
    void setPmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Float)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getPmin <em>Pmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmin</em>' attribute is set.
     * @see #unsetPmin()
     * @see #getPmin()
     * @see #setPmin(Float)
     * @generated
     */
    boolean isSetPmin();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_T1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.t1' kind='element'"
     * @generated
     */
    Float getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_T2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.t2' kind='element'"
     * @generated
     */
    Float getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_T3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.t3' kind='element'"
     * @generated
     */
    Float getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>T4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovHydroIEEE0_T4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovHydroIEEE0.t4' kind='element'"
     * @generated
     */
    Float getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #getT4()
     * @generated
     */
    void setT4( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Float)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE0#getT4 <em>T4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4</em>' attribute is set.
     * @see #unsetT4()
     * @see #getT4()
     * @see #setT4(Float)
     * @generated
     */
    boolean isSetT4();

} // GovHydroIEEE0
