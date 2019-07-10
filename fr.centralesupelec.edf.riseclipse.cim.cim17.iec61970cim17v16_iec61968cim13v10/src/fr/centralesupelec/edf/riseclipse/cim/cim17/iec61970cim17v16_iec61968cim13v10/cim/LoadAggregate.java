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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadAggregate()
 * @model
 * @generated
 */
public interface LoadAggregate extends LoadDynamics {
    /**
     * Returns the value of the '<em><b>Load Static</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Static</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Static</em>' reference.
     * @see #isSetLoadStatic()
     * @see #unsetLoadStatic()
     * @see #setLoadStatic(LoadStatic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadAggregate_LoadStatic()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic#getLoadAggregate
     * @model opposite="LoadAggregate" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadAggregate.LoadStatic' kind='element'"
     * @generated
     */
    LoadStatic getLoadStatic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Static</em>' reference.
     * @see #isSetLoadStatic()
     * @see #unsetLoadStatic()
     * @see #getLoadStatic()
     * @generated
     */
    void setLoadStatic( LoadStatic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadStatic()
     * @see #getLoadStatic()
     * @see #setLoadStatic(LoadStatic)
     * @generated
     */
    void unsetLoadStatic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Static</em>' reference is set.
     * @see #unsetLoadStatic()
     * @see #getLoadStatic()
     * @see #setLoadStatic(LoadStatic)
     * @generated
     */
    boolean isSetLoadStatic();

    /**
     * Returns the value of the '<em><b>Load Motor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Motor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Motor</em>' reference.
     * @see #isSetLoadMotor()
     * @see #unsetLoadMotor()
     * @see #setLoadMotor(LoadMotor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadAggregate_LoadMotor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadMotor#getLoadAggregate
     * @model opposite="LoadAggregate" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadAggregate.LoadMotor' kind='element'"
     * @generated
     */
    LoadMotor getLoadMotor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Motor</em>' reference.
     * @see #isSetLoadMotor()
     * @see #unsetLoadMotor()
     * @see #getLoadMotor()
     * @generated
     */
    void setLoadMotor( LoadMotor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadMotor()
     * @see #getLoadMotor()
     * @see #setLoadMotor(LoadMotor)
     * @generated
     */
    void unsetLoadMotor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Motor</em>' reference is set.
     * @see #unsetLoadMotor()
     * @see #getLoadMotor()
     * @see #setLoadMotor(LoadMotor)
     * @generated
     */
    boolean isSetLoadMotor();

} // LoadAggregate
