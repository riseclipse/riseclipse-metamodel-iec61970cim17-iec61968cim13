/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getSupportsAutonomousDst <em>Supports Autonomous Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getComFunctions <em>Com Functions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComModule()
 * @model
 * @generated
 */
public interface ComModule extends Asset {
    /**
     * Returns the value of the '<em><b>Amr System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amr System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amr System</em>' attribute.
     * @see #isSetAmrSystem()
     * @see #unsetAmrSystem()
     * @see #setAmrSystem(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComModule_AmrSystem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComModule.amrSystem' kind='element'"
     * @generated
     */
    String getAmrSystem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getAmrSystem <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amr System</em>' attribute.
     * @see #isSetAmrSystem()
     * @see #unsetAmrSystem()
     * @see #getAmrSystem()
     * @generated
     */
    void setAmrSystem( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getAmrSystem <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmrSystem()
     * @see #getAmrSystem()
     * @see #setAmrSystem(String)
     * @generated
     */
    void unsetAmrSystem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getAmrSystem <em>Amr System</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Amr System</em>' attribute is set.
     * @see #unsetAmrSystem()
     * @see #getAmrSystem()
     * @see #setAmrSystem(String)
     * @generated
     */
    boolean isSetAmrSystem();

    /**
     * Returns the value of the '<em><b>Supports Autonomous Dst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supports Autonomous Dst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supports Autonomous Dst</em>' attribute.
     * @see #isSetSupportsAutonomousDst()
     * @see #unsetSupportsAutonomousDst()
     * @see #setSupportsAutonomousDst(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComModule_SupportsAutonomousDst()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComModule.supportsAutonomousDst' kind='element'"
     * @generated
     */
    Boolean getSupportsAutonomousDst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getSupportsAutonomousDst <em>Supports Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supports Autonomous Dst</em>' attribute.
     * @see #isSetSupportsAutonomousDst()
     * @see #unsetSupportsAutonomousDst()
     * @see #getSupportsAutonomousDst()
     * @generated
     */
    void setSupportsAutonomousDst( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getSupportsAutonomousDst <em>Supports Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportsAutonomousDst()
     * @see #getSupportsAutonomousDst()
     * @see #setSupportsAutonomousDst(Boolean)
     * @generated
     */
    void unsetSupportsAutonomousDst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getSupportsAutonomousDst <em>Supports Autonomous Dst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Supports Autonomous Dst</em>' attribute is set.
     * @see #unsetSupportsAutonomousDst()
     * @see #getSupportsAutonomousDst()
     * @see #setSupportsAutonomousDst(Boolean)
     * @generated
     */
    boolean isSetSupportsAutonomousDst();

    /**
     * Returns the value of the '<em><b>Time Zone Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Zone Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Zone Offset</em>' attribute.
     * @see #isSetTimeZoneOffset()
     * @see #unsetTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComModule_TimeZoneOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComModule.timeZoneOffset' kind='element'"
     * @generated
     */
    Float getTimeZoneOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Zone Offset</em>' attribute.
     * @see #isSetTimeZoneOffset()
     * @see #unsetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @generated
     */
    void setTimeZoneOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @generated
     */
    void unsetTimeZoneOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Zone Offset</em>' attribute is set.
     * @see #unsetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @generated
     */
    boolean isSetTimeZoneOffset();

    /**
     * Returns the value of the '<em><b>Com Functions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule <em>Com Module</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Com Functions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Com Functions</em>' reference list.
     * @see #isSetComFunctions()
     * @see #unsetComFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getComModule_ComFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction#getComModule
     * @model opposite="ComModule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ComModule.ComFunctions' kind='element'"
     * @generated
     */
    EList< ComFunction > getComFunctions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getComFunctions <em>Com Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetComFunctions()
     * @see #getComFunctions()
     * @generated
     */
    void unsetComFunctions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule#getComFunctions <em>Com Functions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Com Functions</em>' reference list is set.
     * @see #unsetComFunctions()
     * @see #getComFunctions()
     * @generated
     */
    boolean isSetComFunctions();

} // ComModule
