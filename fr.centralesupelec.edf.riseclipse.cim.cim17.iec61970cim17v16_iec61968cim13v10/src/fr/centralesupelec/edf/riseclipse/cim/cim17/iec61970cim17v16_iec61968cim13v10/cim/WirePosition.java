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
 * A representation of the model object '<em><b>Wire Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWirePhaseInfo <em>Wire Phase Info</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePosition()
 * @model
 * @generated
 */
public interface WirePosition extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>XCoord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XCoord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XCoord</em>' attribute.
     * @see #isSetXCoord()
     * @see #unsetXCoord()
     * @see #setXCoord(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePosition_XCoord()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePosition.xCoord' kind='element'"
     * @generated
     */
    Float getXCoord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getXCoord <em>XCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XCoord</em>' attribute.
     * @see #isSetXCoord()
     * @see #unsetXCoord()
     * @see #getXCoord()
     * @generated
     */
    void setXCoord( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getXCoord <em>XCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXCoord()
     * @see #getXCoord()
     * @see #setXCoord(Float)
     * @generated
     */
    void unsetXCoord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getXCoord <em>XCoord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XCoord</em>' attribute is set.
     * @see #unsetXCoord()
     * @see #getXCoord()
     * @see #setXCoord(Float)
     * @generated
     */
    boolean isSetXCoord();

    /**
     * Returns the value of the '<em><b>YCoord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>YCoord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>YCoord</em>' attribute.
     * @see #isSetYCoord()
     * @see #unsetYCoord()
     * @see #setYCoord(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePosition_YCoord()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePosition.yCoord' kind='element'"
     * @generated
     */
    Float getYCoord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getYCoord <em>YCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>YCoord</em>' attribute.
     * @see #isSetYCoord()
     * @see #unsetYCoord()
     * @see #getYCoord()
     * @generated
     */
    void setYCoord( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getYCoord <em>YCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYCoord()
     * @see #getYCoord()
     * @see #setYCoord(Float)
     * @generated
     */
    void unsetYCoord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getYCoord <em>YCoord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>YCoord</em>' attribute is set.
     * @see #unsetYCoord()
     * @see #getYCoord()
     * @see #setYCoord(Float)
     * @generated
     */
    boolean isSetYCoord();

    /**
     * Returns the value of the '<em><b>Wire Spacing Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getWirePositions <em>Wire Positions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Spacing Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Spacing Info</em>' reference.
     * @see #isSetWireSpacingInfo()
     * @see #unsetWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacing)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePosition_WireSpacingInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getWirePositions
     * @model opposite="WirePositions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePosition.WireSpacingInfo' kind='element'"
     * @generated
     */
    WireSpacing getWireSpacingInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Spacing Info</em>' reference.
     * @see #isSetWireSpacingInfo()
     * @see #unsetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @generated
     */
    void setWireSpacingInfo( WireSpacing value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacing)
     * @generated
     */
    void unsetWireSpacingInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Spacing Info</em>' reference is set.
     * @see #unsetWireSpacingInfo()
     * @see #getWireSpacingInfo()
     * @see #setWireSpacingInfo(WireSpacing)
     * @generated
     */
    boolean isSetWireSpacingInfo();

    /**
     * Returns the value of the '<em><b>Wire Phase Info</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition <em>Wire Position</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Phase Info</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Phase Info</em>' reference list.
     * @see #isSetWirePhaseInfo()
     * @see #unsetWirePhaseInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePosition_WirePhaseInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition
     * @model opposite="WirePosition" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePosition.WirePhaseInfo' kind='element'"
     * @generated
     */
    EList< WirePhaseInfo > getWirePhaseInfo();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWirePhaseInfo <em>Wire Phase Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWirePhaseInfo()
     * @see #getWirePhaseInfo()
     * @generated
     */
    void unsetWirePhaseInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWirePhaseInfo <em>Wire Phase Info</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Phase Info</em>' reference list is set.
     * @see #unsetWirePhaseInfo()
     * @see #getWirePhaseInfo()
     * @generated
     */
    boolean isSetWirePhaseInfo();

} // WirePosition
