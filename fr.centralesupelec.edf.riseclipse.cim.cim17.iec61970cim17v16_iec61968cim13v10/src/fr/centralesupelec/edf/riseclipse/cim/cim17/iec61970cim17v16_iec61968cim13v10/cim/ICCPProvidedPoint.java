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
 * A representation of the model object '<em><b>ICCP Provided Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getAccessPriviledge <em>Access Priviledge</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointQuality <em>Point Quality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointType <em>Point Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPProvidedPoint()
 * @model
 * @generated
 */
public interface ICCPProvidedPoint extends ProvidedBilateralPoint {
    /**
     * Returns the value of the '<em><b>Access Priviledge</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPAccessPrivilegeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Priviledge</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Priviledge</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPAccessPrivilegeKind
     * @see #isSetAccessPriviledge()
     * @see #unsetAccessPriviledge()
     * @see #setAccessPriviledge(ICCPAccessPrivilegeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPProvidedPoint_AccessPriviledge()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPProvidedPoint.accessPriviledge' kind='element'"
     * @generated
     */
    ICCPAccessPrivilegeKind getAccessPriviledge();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getAccessPriviledge <em>Access Priviledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Priviledge</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPAccessPrivilegeKind
     * @see #isSetAccessPriviledge()
     * @see #unsetAccessPriviledge()
     * @see #getAccessPriviledge()
     * @generated
     */
    void setAccessPriviledge( ICCPAccessPrivilegeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getAccessPriviledge <em>Access Priviledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccessPriviledge()
     * @see #getAccessPriviledge()
     * @see #setAccessPriviledge(ICCPAccessPrivilegeKind)
     * @generated
     */
    void unsetAccessPriviledge();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getAccessPriviledge <em>Access Priviledge</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Access Priviledge</em>' attribute is set.
     * @see #unsetAccessPriviledge()
     * @see #getAccessPriviledge()
     * @see #setAccessPriviledge(ICCPAccessPrivilegeKind)
     * @generated
     */
    boolean isSetAccessPriviledge();

    /**
     * Returns the value of the '<em><b>Point Quality</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPQualityKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point Quality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point Quality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPQualityKind
     * @see #isSetPointQuality()
     * @see #unsetPointQuality()
     * @see #setPointQuality(ICCPQualityKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPProvidedPoint_PointQuality()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPProvidedPoint.pointQuality' kind='element'"
     * @generated
     */
    ICCPQualityKind getPointQuality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointQuality <em>Point Quality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point Quality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPQualityKind
     * @see #isSetPointQuality()
     * @see #unsetPointQuality()
     * @see #getPointQuality()
     * @generated
     */
    void setPointQuality( ICCPQualityKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointQuality <em>Point Quality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPointQuality()
     * @see #getPointQuality()
     * @see #setPointQuality(ICCPQualityKind)
     * @generated
     */
    void unsetPointQuality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointQuality <em>Point Quality</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Point Quality</em>' attribute is set.
     * @see #unsetPointQuality()
     * @see #getPointQuality()
     * @see #setPointQuality(ICCPQualityKind)
     * @generated
     */
    boolean isSetPointQuality();

    /**
     * Returns the value of the '<em><b>Point Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPPointKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPPointKind
     * @see #isSetPointType()
     * @see #unsetPointType()
     * @see #setPointType(ICCPPointKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPProvidedPoint_PointType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPProvidedPoint.pointType' kind='element'"
     * @generated
     */
    ICCPPointKind getPointType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointType <em>Point Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPPointKind
     * @see #isSetPointType()
     * @see #unsetPointType()
     * @see #getPointType()
     * @generated
     */
    void setPointType( ICCPPointKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointType <em>Point Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPointType()
     * @see #getPointType()
     * @see #setPointType(ICCPPointKind)
     * @generated
     */
    void unsetPointType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getPointType <em>Point Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Point Type</em>' attribute is set.
     * @see #unsetPointType()
     * @see #getPointType()
     * @see #setPointType(ICCPPointKind)
     * @generated
     */
    boolean isSetPointType();

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(ICCPScope)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPProvidedPoint_Scope()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPProvidedPoint.scope' kind='element'"
     * @generated
     */
    ICCPScope getScope();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope( ICCPScope value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(ICCPScope)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(ICCPScope)
     * @generated
     */
    boolean isSetScope();

} // ICCPProvidedPoint
