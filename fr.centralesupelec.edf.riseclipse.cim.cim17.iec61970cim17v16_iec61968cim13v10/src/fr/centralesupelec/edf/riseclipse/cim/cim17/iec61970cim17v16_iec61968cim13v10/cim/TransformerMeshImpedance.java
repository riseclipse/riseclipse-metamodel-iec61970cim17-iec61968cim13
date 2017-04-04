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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Mesh Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEndInfos <em>To Transformer End Infos</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance()
 * @model
 * @generated
 */
public interface TransformerMeshImpedance extends IdentifiedObject {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR <em>R</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR <em>R</em>}' attribute is set.
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
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_R0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.r0' kind='element'"
     * @generated
     */
    Float getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_X()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.x' kind='element'"
     * @generated
     */
    Float getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #getX()
     * @generated
     */
    void setX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Float)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX <em>X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X</em>' attribute is set.
     * @see #unsetX()
     * @see #getX()
     * @see #setX(Float)
     * @generated
     */
    boolean isSetX();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_X0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.x0' kind='element'"
     * @generated
     */
    Float getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>To Transformer End</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Transformer End</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Transformer End</em>' reference list.
     * @see #isSetToTransformerEnd()
     * @see #unsetToTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_ToTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getToMeshImpedance
     * @model opposite="ToMeshImpedance" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.ToTransformerEnd' kind='element'"
     * @generated
     */
    EList< TransformerEnd > getToTransformerEnd();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToTransformerEnd()
     * @see #getToTransformerEnd()
     * @generated
     */
    void unsetToTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To Transformer End</em>' reference list is set.
     * @see #unsetToTransformerEnd()
     * @see #getToTransformerEnd()
     * @generated
     */
    boolean isSetToTransformerEnd();

    /**
     * Returns the value of the '<em><b>From Transformer End Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getFromMeshImpedances <em>From Mesh Impedances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Transformer End Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Transformer End Info</em>' reference.
     * @see #isSetFromTransformerEndInfo()
     * @see #unsetFromTransformerEndInfo()
     * @see #setFromTransformerEndInfo(TransformerEndInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_FromTransformerEndInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getFromMeshImpedances
     * @model opposite="FromMeshImpedances" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.FromTransformerEndInfo' kind='element'"
     * @generated
     */
    TransformerEndInfo getFromTransformerEndInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Transformer End Info</em>' reference.
     * @see #isSetFromTransformerEndInfo()
     * @see #unsetFromTransformerEndInfo()
     * @see #getFromTransformerEndInfo()
     * @generated
     */
    void setFromTransformerEndInfo( TransformerEndInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromTransformerEndInfo()
     * @see #getFromTransformerEndInfo()
     * @see #setFromTransformerEndInfo(TransformerEndInfo)
     * @generated
     */
    void unsetFromTransformerEndInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From Transformer End Info</em>' reference is set.
     * @see #unsetFromTransformerEndInfo()
     * @see #getFromTransformerEndInfo()
     * @see #setFromTransformerEndInfo(TransformerEndInfo)
     * @generated
     */
    boolean isSetFromTransformerEndInfo();

    /**
     * Returns the value of the '<em><b>From Transformer End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Transformer End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Transformer End</em>' reference.
     * @see #isSetFromTransformerEnd()
     * @see #unsetFromTransformerEnd()
     * @see #setFromTransformerEnd(TransformerEnd)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_FromTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getFromMeshImpedance
     * @model opposite="FromMeshImpedance" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.FromTransformerEnd' kind='element'"
     * @generated
     */
    TransformerEnd getFromTransformerEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Transformer End</em>' reference.
     * @see #isSetFromTransformerEnd()
     * @see #unsetFromTransformerEnd()
     * @see #getFromTransformerEnd()
     * @generated
     */
    void setFromTransformerEnd( TransformerEnd value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromTransformerEnd()
     * @see #getFromTransformerEnd()
     * @see #setFromTransformerEnd(TransformerEnd)
     * @generated
     */
    void unsetFromTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From Transformer End</em>' reference is set.
     * @see #unsetFromTransformerEnd()
     * @see #getFromTransformerEnd()
     * @see #setFromTransformerEnd(TransformerEnd)
     * @generated
     */
    boolean isSetFromTransformerEnd();

    /**
     * Returns the value of the '<em><b>To Transformer End Infos</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getToMeshImpedances <em>To Mesh Impedances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Transformer End Infos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Transformer End Infos</em>' reference list.
     * @see #isSetToTransformerEndInfos()
     * @see #unsetToTransformerEndInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerMeshImpedance_ToTransformerEndInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getToMeshImpedances
     * @model opposite="ToMeshImpedances" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerMeshImpedance.ToTransformerEndInfos' kind='element'"
     * @generated
     */
    EList< TransformerEndInfo > getToTransformerEndInfos();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEndInfos <em>To Transformer End Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToTransformerEndInfos()
     * @see #getToTransformerEndInfos()
     * @generated
     */
    void unsetToTransformerEndInfos();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance#getToTransformerEndInfos <em>To Transformer End Infos</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To Transformer End Infos</em>' reference list is set.
     * @see #unsetToTransformerEndInfos()
     * @see #getToTransformerEndInfos()
     * @generated
     */
    boolean isSetToTransformerEndInfos();

} // TransformerMeshImpedance
