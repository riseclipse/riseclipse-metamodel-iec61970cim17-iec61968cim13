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
 * A representation of the model object '<em><b>Gov GAST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getKt <em>Kt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmin <em>Vmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST()
 * @model
 * @generated
 */
public interface GovGAST extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>At</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #setAt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_At()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.at' kind='element'"
     * @generated
     */
    Float getAt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #getAt()
     * @generated
     */
    void setAt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAt()
     * @see #getAt()
     * @see #setAt(Float)
     * @generated
     */
    void unsetAt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getAt <em>At</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>At</em>' attribute is set.
     * @see #unsetAt()
     * @see #getAt()
     * @see #setAt(Float)
     * @generated
     */
    boolean isSetAt();

    /**
     * Returns the value of the '<em><b>Dturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dturb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #setDturb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_Dturb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.dturb' kind='element'"
     * @generated
     */
    Float getDturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #getDturb()
     * @generated
     */
    void setDturb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDturb()
     * @see #getDturb()
     * @see #setDturb(Float)
     * @generated
     */
    void unsetDturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getDturb <em>Dturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dturb</em>' attribute is set.
     * @see #unsetDturb()
     * @see #getDturb()
     * @see #setDturb(Float)
     * @generated
     */
    boolean isSetDturb();

    /**
     * Returns the value of the '<em><b>Kt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kt</em>' attribute.
     * @see #isSetKt()
     * @see #unsetKt()
     * @see #setKt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_Kt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.kt' kind='element'"
     * @generated
     */
    Float getKt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getKt <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kt</em>' attribute.
     * @see #isSetKt()
     * @see #unsetKt()
     * @see #getKt()
     * @generated
     */
    void setKt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getKt <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKt()
     * @see #getKt()
     * @see #setKt(Float)
     * @generated
     */
    void unsetKt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getKt <em>Kt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kt</em>' attribute is set.
     * @see #unsetKt()
     * @see #getKt()
     * @see #setKt(Float)
     * @generated
     */
    boolean isSetKt();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_Mwbase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.mwbase' kind='element'"
     * @generated
     */
    Float getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Float)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    boolean isSetR();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_T1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.t1' kind='element'"
     * @generated
     */
    Float getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Float)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT1 <em>T1</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_T2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.t2' kind='element'"
     * @generated
     */
    Float getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Float)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT2 <em>T2</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_T3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.t3' kind='element'"
     * @generated
     */
    Float getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Float)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getT3 <em>T3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #setVmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_Vmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.vmax' kind='element'"
     * @generated
     */
    Float getVmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #getVmax()
     * @generated
     */
    void setVmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmax()
     * @see #getVmax()
     * @see #setVmax(Float)
     * @generated
     */
    void unsetVmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmax <em>Vmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmax</em>' attribute is set.
     * @see #unsetVmax()
     * @see #getVmax()
     * @see #setVmax(Float)
     * @generated
     */
    boolean isSetVmax();

    /**
     * Returns the value of the '<em><b>Vmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #setVmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST_Vmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST.vmin' kind='element'"
     * @generated
     */
    Float getVmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #getVmin()
     * @generated
     */
    void setVmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmin()
     * @see #getVmin()
     * @see #setVmin(Float)
     * @generated
     */
    void unsetVmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST#getVmin <em>Vmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmin</em>' attribute is set.
     * @see #unsetVmin()
     * @see #getVmin()
     * @see #setVmin(Float)
     * @generated
     */
    boolean isSetVmin();

} // GovGAST
