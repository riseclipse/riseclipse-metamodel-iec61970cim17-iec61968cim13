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
 * A representation of the model object '<em><b>Load Generic Non Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBs <em>Bs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBt <em>Bt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLt <em>Lt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getPt <em>Pt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getQt <em>Qt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTq <em>Tq</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear()
 * @model
 * @generated
 */
public interface LoadGenericNonLinear extends LoadDynamics {
    /**
     * Returns the value of the '<em><b>Bs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bs</em>' attribute.
     * @see #isSetBs()
     * @see #unsetBs()
     * @see #setBs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Bs()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.bs' kind='element'"
     * @generated
     */
    Float getBs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bs</em>' attribute.
     * @see #isSetBs()
     * @see #unsetBs()
     * @see #getBs()
     * @generated
     */
    void setBs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBs()
     * @see #getBs()
     * @see #setBs(Float)
     * @generated
     */
    void unsetBs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bs</em>' attribute is set.
     * @see #unsetBs()
     * @see #getBs()
     * @see #setBs(Float)
     * @generated
     */
    boolean isSetBs();

    /**
     * Returns the value of the '<em><b>Bt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bt</em>' attribute.
     * @see #isSetBt()
     * @see #unsetBt()
     * @see #setBt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Bt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.bt' kind='element'"
     * @generated
     */
    Float getBt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bt</em>' attribute.
     * @see #isSetBt()
     * @see #unsetBt()
     * @see #getBt()
     * @generated
     */
    void setBt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBt()
     * @see #getBt()
     * @see #setBt(Float)
     * @generated
     */
    void unsetBt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bt</em>' attribute is set.
     * @see #unsetBt()
     * @see #getBt()
     * @see #setBt(Float)
     * @generated
     */
    boolean isSetBt();

    /**
     * Returns the value of the '<em><b>Generic Non Linear Load Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericNonLinearLoadModelKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generic Non Linear Load Model Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Non Linear Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericNonLinearLoadModelKind
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_GenericNonLinearLoadModelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.genericNonLinearLoadModelType' kind='element'"
     * @generated
     */
    GenericNonLinearLoadModelKind getGenericNonLinearLoadModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generic Non Linear Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericNonLinearLoadModelKind
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     */
    void setGenericNonLinearLoadModelType( GenericNonLinearLoadModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @generated
     */
    void unsetGenericNonLinearLoadModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generic Non Linear Load Model Type</em>' attribute is set.
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @generated
     */
    boolean isSetGenericNonLinearLoadModelType();

    /**
     * Returns the value of the '<em><b>Ls</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ls</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #setLs(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Ls()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.ls' kind='element'"
     * @generated
     */
    Float getLs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #getLs()
     * @generated
     */
    void setLs( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLs()
     * @see #getLs()
     * @see #setLs(Float)
     * @generated
     */
    void unsetLs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ls</em>' attribute is set.
     * @see #unsetLs()
     * @see #getLs()
     * @see #setLs(Float)
     * @generated
     */
    boolean isSetLs();

    /**
     * Returns the value of the '<em><b>Lt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lt</em>' attribute.
     * @see #isSetLt()
     * @see #unsetLt()
     * @see #setLt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Lt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.lt' kind='element'"
     * @generated
     */
    Float getLt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lt</em>' attribute.
     * @see #isSetLt()
     * @see #unsetLt()
     * @see #getLt()
     * @generated
     */
    void setLt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLt()
     * @see #getLt()
     * @see #setLt(Float)
     * @generated
     */
    void unsetLt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lt</em>' attribute is set.
     * @see #unsetLt()
     * @see #getLt()
     * @see #setLt(Float)
     * @generated
     */
    boolean isSetLt();

    /**
     * Returns the value of the '<em><b>Pt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pt</em>' attribute.
     * @see #isSetPt()
     * @see #unsetPt()
     * @see #setPt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Pt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.pt' kind='element'"
     * @generated
     */
    Float getPt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getPt <em>Pt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pt</em>' attribute.
     * @see #isSetPt()
     * @see #unsetPt()
     * @see #getPt()
     * @generated
     */
    void setPt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getPt <em>Pt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPt()
     * @see #getPt()
     * @see #setPt(Float)
     * @generated
     */
    void unsetPt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getPt <em>Pt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pt</em>' attribute is set.
     * @see #unsetPt()
     * @see #getPt()
     * @see #setPt(Float)
     * @generated
     */
    boolean isSetPt();

    /**
     * Returns the value of the '<em><b>Qt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qt</em>' attribute.
     * @see #isSetQt()
     * @see #unsetQt()
     * @see #setQt(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Qt()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.qt' kind='element'"
     * @generated
     */
    Float getQt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getQt <em>Qt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qt</em>' attribute.
     * @see #isSetQt()
     * @see #unsetQt()
     * @see #getQt()
     * @generated
     */
    void setQt( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getQt <em>Qt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQt()
     * @see #getQt()
     * @see #setQt(Float)
     * @generated
     */
    void unsetQt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getQt <em>Qt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qt</em>' attribute is set.
     * @see #unsetQt()
     * @see #getQt()
     * @see #setQt(Float)
     * @generated
     */
    boolean isSetQt();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Tp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.tp' kind='element'"
     * @generated
     */
    Float getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #getTp()
     * @generated
     */
    void setTp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Float)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tp</em>' attribute is set.
     * @see #unsetTp()
     * @see #getTp()
     * @see #setTp(Float)
     * @generated
     */
    boolean isSetTp();

    /**
     * Returns the value of the '<em><b>Tq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tq</em>' attribute.
     * @see #isSetTq()
     * @see #unsetTq()
     * @see #setTq(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGenericNonLinear_Tq()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGenericNonLinear.tq' kind='element'"
     * @generated
     */
    Float getTq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tq</em>' attribute.
     * @see #isSetTq()
     * @see #unsetTq()
     * @see #getTq()
     * @generated
     */
    void setTq( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTq()
     * @see #getTq()
     * @see #setTq(Float)
     * @generated
     */
    void unsetTq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tq</em>' attribute is set.
     * @see #unsetTq()
     * @see #getTq()
     * @see #setTq(Float)
     * @generated
     */
    boolean isSetTq();

} // LoadGenericNonLinear
