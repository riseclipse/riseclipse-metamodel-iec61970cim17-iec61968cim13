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
 * A representation of the model object '<em><b>Com Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrAddress <em>Amr Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrRouter <em>Amr Router</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getTechnology <em>Technology</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule <em>Com Module</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction()
 * @model
 * @generated
 */
public interface ComFunction extends EndDeviceFunction {
    /**
     * Returns the value of the '<em><b>Amr Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amr Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amr Address</em>' attribute.
     * @see #isSetAmrAddress()
     * @see #unsetAmrAddress()
     * @see #setAmrAddress(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction_AmrAddress()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComFunction.amrAddress' kind='element'"
     * @generated
     */
    String getAmrAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amr Address</em>' attribute.
     * @see #isSetAmrAddress()
     * @see #unsetAmrAddress()
     * @see #getAmrAddress()
     * @generated
     */
    void setAmrAddress( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmrAddress()
     * @see #getAmrAddress()
     * @see #setAmrAddress(String)
     * @generated
     */
    void unsetAmrAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Amr Address</em>' attribute is set.
     * @see #unsetAmrAddress()
     * @see #getAmrAddress()
     * @see #setAmrAddress(String)
     * @generated
     */
    boolean isSetAmrAddress();

    /**
     * Returns the value of the '<em><b>Amr Router</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amr Router</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amr Router</em>' attribute.
     * @see #isSetAmrRouter()
     * @see #unsetAmrRouter()
     * @see #setAmrRouter(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction_AmrRouter()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComFunction.amrRouter' kind='element'"
     * @generated
     */
    String getAmrRouter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amr Router</em>' attribute.
     * @see #isSetAmrRouter()
     * @see #unsetAmrRouter()
     * @see #getAmrRouter()
     * @generated
     */
    void setAmrRouter( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmrRouter()
     * @see #getAmrRouter()
     * @see #setAmrRouter(String)
     * @generated
     */
    void unsetAmrRouter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Amr Router</em>' attribute is set.
     * @see #unsetAmrRouter()
     * @see #getAmrRouter()
     * @see #setAmrRouter(String)
     * @generated
     */
    boolean isSetAmrRouter();

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComDirectionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(ComDirectionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction_Direction()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComFunction.direction' kind='element'"
     * @generated
     */
    ComDirectionKind getDirection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection( ComDirectionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(ComDirectionKind)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(ComDirectionKind)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Technology</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComTechnologyKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technology</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Technology</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComTechnologyKind
     * @see #isSetTechnology()
     * @see #unsetTechnology()
     * @see #setTechnology(ComTechnologyKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction_Technology()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComFunction.technology' kind='element'"
     * @generated
     */
    ComTechnologyKind getTechnology();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getTechnology <em>Technology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Technology</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComTechnologyKind
     * @see #isSetTechnology()
     * @see #unsetTechnology()
     * @see #getTechnology()
     * @generated
     */
    void setTechnology( ComTechnologyKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getTechnology <em>Technology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTechnology()
     * @see #getTechnology()
     * @see #setTechnology(ComTechnologyKind)
     * @generated
     */
    void unsetTechnology();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getTechnology <em>Technology</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Technology</em>' attribute is set.
     * @see #unsetTechnology()
     * @see #getTechnology()
     * @see #setTechnology(ComTechnologyKind)
     * @generated
     */
    boolean isSetTechnology();

    /**
     * Returns the value of the '<em><b>Com Module</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getComFunctions <em>Com Functions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Com Module</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Com Module</em>' reference.
     * @see #isSetComModule()
     * @see #unsetComModule()
     * @see #setComModule(ComModule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComFunction_ComModule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getComFunctions
     * @model opposite="ComFunctions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComFunction.ComModule' kind='element'"
     * @generated
     */
    ComModule getComModule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule <em>Com Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Com Module</em>' reference.
     * @see #isSetComModule()
     * @see #unsetComModule()
     * @see #getComModule()
     * @generated
     */
    void setComModule( ComModule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule <em>Com Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetComModule()
     * @see #getComModule()
     * @see #setComModule(ComModule)
     * @generated
     */
    void unsetComModule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule <em>Com Module</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Com Module</em>' reference is set.
     * @see #unsetComModule()
     * @see #getComModule()
     * @see #setComModule(ComModule)
     * @generated
     */
    boolean isSetComModule();

} // ComFunction
