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
 * A representation of the model object '<em><b>Wire Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreRadius <em>Core Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreStrandCount <em>Core Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getGmr <em>Gmr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulated <em>Insulated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationMaterial <em>Insulation Material</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationThickness <em>Insulation Thickness</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getMaterial <em>Material</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC25 <em>RAC25</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC50 <em>RAC50</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC75 <em>RAC75</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRadius <em>Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRDC20 <em>RDC20</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getStrandCount <em>Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getWirePhaseInfo <em>Wire Phase Info</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo()
 * @model
 * @generated
 */
public interface WireInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Core Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Core Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Core Radius</em>' attribute.
     * @see #isSetCoreRadius()
     * @see #unsetCoreRadius()
     * @see #setCoreRadius(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_CoreRadius()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.coreRadius' kind='element'"
     * @generated
     */
    Float getCoreRadius();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreRadius <em>Core Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Core Radius</em>' attribute.
     * @see #isSetCoreRadius()
     * @see #unsetCoreRadius()
     * @see #getCoreRadius()
     * @generated
     */
    void setCoreRadius( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreRadius <em>Core Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoreRadius()
     * @see #getCoreRadius()
     * @see #setCoreRadius(Float)
     * @generated
     */
    void unsetCoreRadius();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreRadius <em>Core Radius</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Core Radius</em>' attribute is set.
     * @see #unsetCoreRadius()
     * @see #getCoreRadius()
     * @see #setCoreRadius(Float)
     * @generated
     */
    boolean isSetCoreRadius();

    /**
     * Returns the value of the '<em><b>Core Strand Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Core Strand Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Core Strand Count</em>' attribute.
     * @see #isSetCoreStrandCount()
     * @see #unsetCoreStrandCount()
     * @see #setCoreStrandCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_CoreStrandCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.coreStrandCount' kind='element'"
     * @generated
     */
    Integer getCoreStrandCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreStrandCount <em>Core Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Core Strand Count</em>' attribute.
     * @see #isSetCoreStrandCount()
     * @see #unsetCoreStrandCount()
     * @see #getCoreStrandCount()
     * @generated
     */
    void setCoreStrandCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreStrandCount <em>Core Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoreStrandCount()
     * @see #getCoreStrandCount()
     * @see #setCoreStrandCount(Integer)
     * @generated
     */
    void unsetCoreStrandCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getCoreStrandCount <em>Core Strand Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Core Strand Count</em>' attribute is set.
     * @see #unsetCoreStrandCount()
     * @see #getCoreStrandCount()
     * @see #setCoreStrandCount(Integer)
     * @generated
     */
    boolean isSetCoreStrandCount();

    /**
     * Returns the value of the '<em><b>Gmr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gmr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gmr</em>' attribute.
     * @see #isSetGmr()
     * @see #unsetGmr()
     * @see #setGmr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_Gmr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.gmr' kind='element'"
     * @generated
     */
    Float getGmr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getGmr <em>Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmr</em>' attribute.
     * @see #isSetGmr()
     * @see #unsetGmr()
     * @see #getGmr()
     * @generated
     */
    void setGmr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getGmr <em>Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmr()
     * @see #getGmr()
     * @see #setGmr(Float)
     * @generated
     */
    void unsetGmr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getGmr <em>Gmr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmr</em>' attribute is set.
     * @see #unsetGmr()
     * @see #getGmr()
     * @see #setGmr(Float)
     * @generated
     */
    boolean isSetGmr();

    /**
     * Returns the value of the '<em><b>Insulated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insulated</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insulated</em>' attribute.
     * @see #isSetInsulated()
     * @see #unsetInsulated()
     * @see #setInsulated(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_Insulated()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.insulated' kind='element'"
     * @generated
     */
    Boolean getInsulated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulated <em>Insulated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insulated</em>' attribute.
     * @see #isSetInsulated()
     * @see #unsetInsulated()
     * @see #getInsulated()
     * @generated
     */
    void setInsulated( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulated <em>Insulated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInsulated()
     * @see #getInsulated()
     * @see #setInsulated(Boolean)
     * @generated
     */
    void unsetInsulated();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulated <em>Insulated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Insulated</em>' attribute is set.
     * @see #unsetInsulated()
     * @see #getInsulated()
     * @see #setInsulated(Boolean)
     * @generated
     */
    boolean isSetInsulated();

    /**
     * Returns the value of the '<em><b>Insulation Material</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInsulationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insulation Material</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insulation Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInsulationKind
     * @see #isSetInsulationMaterial()
     * @see #unsetInsulationMaterial()
     * @see #setInsulationMaterial(WireInsulationKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_InsulationMaterial()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.insulationMaterial' kind='element'"
     * @generated
     */
    WireInsulationKind getInsulationMaterial();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insulation Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInsulationKind
     * @see #isSetInsulationMaterial()
     * @see #unsetInsulationMaterial()
     * @see #getInsulationMaterial()
     * @generated
     */
    void setInsulationMaterial( WireInsulationKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInsulationMaterial()
     * @see #getInsulationMaterial()
     * @see #setInsulationMaterial(WireInsulationKind)
     * @generated
     */
    void unsetInsulationMaterial();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Insulation Material</em>' attribute is set.
     * @see #unsetInsulationMaterial()
     * @see #getInsulationMaterial()
     * @see #setInsulationMaterial(WireInsulationKind)
     * @generated
     */
    boolean isSetInsulationMaterial();

    /**
     * Returns the value of the '<em><b>Insulation Thickness</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insulation Thickness</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insulation Thickness</em>' attribute.
     * @see #isSetInsulationThickness()
     * @see #unsetInsulationThickness()
     * @see #setInsulationThickness(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_InsulationThickness()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.insulationThickness' kind='element'"
     * @generated
     */
    Float getInsulationThickness();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insulation Thickness</em>' attribute.
     * @see #isSetInsulationThickness()
     * @see #unsetInsulationThickness()
     * @see #getInsulationThickness()
     * @generated
     */
    void setInsulationThickness( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInsulationThickness()
     * @see #getInsulationThickness()
     * @see #setInsulationThickness(Float)
     * @generated
     */
    void unsetInsulationThickness();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Insulation Thickness</em>' attribute is set.
     * @see #unsetInsulationThickness()
     * @see #getInsulationThickness()
     * @see #setInsulationThickness(Float)
     * @generated
     */
    boolean isSetInsulationThickness();

    /**
     * Returns the value of the '<em><b>Material</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireMaterialKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Material</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireMaterialKind
     * @see #isSetMaterial()
     * @see #unsetMaterial()
     * @see #setMaterial(WireMaterialKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_Material()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.material' kind='element'"
     * @generated
     */
    WireMaterialKind getMaterial();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getMaterial <em>Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireMaterialKind
     * @see #isSetMaterial()
     * @see #unsetMaterial()
     * @see #getMaterial()
     * @generated
     */
    void setMaterial( WireMaterialKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getMaterial <em>Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaterial()
     * @see #getMaterial()
     * @see #setMaterial(WireMaterialKind)
     * @generated
     */
    void unsetMaterial();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getMaterial <em>Material</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Material</em>' attribute is set.
     * @see #unsetMaterial()
     * @see #getMaterial()
     * @see #setMaterial(WireMaterialKind)
     * @generated
     */
    boolean isSetMaterial();

    /**
     * Returns the value of the '<em><b>RAC25</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RAC25</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RAC25</em>' attribute.
     * @see #isSetRAC25()
     * @see #unsetRAC25()
     * @see #setRAC25(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_RAC25()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.rAC25' kind='element'"
     * @generated
     */
    Float getRAC25();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC25 <em>RAC25</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RAC25</em>' attribute.
     * @see #isSetRAC25()
     * @see #unsetRAC25()
     * @see #getRAC25()
     * @generated
     */
    void setRAC25( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC25 <em>RAC25</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRAC25()
     * @see #getRAC25()
     * @see #setRAC25(Float)
     * @generated
     */
    void unsetRAC25();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC25 <em>RAC25</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RAC25</em>' attribute is set.
     * @see #unsetRAC25()
     * @see #getRAC25()
     * @see #setRAC25(Float)
     * @generated
     */
    boolean isSetRAC25();

    /**
     * Returns the value of the '<em><b>RAC50</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RAC50</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RAC50</em>' attribute.
     * @see #isSetRAC50()
     * @see #unsetRAC50()
     * @see #setRAC50(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_RAC50()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.rAC50' kind='element'"
     * @generated
     */
    Float getRAC50();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC50 <em>RAC50</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RAC50</em>' attribute.
     * @see #isSetRAC50()
     * @see #unsetRAC50()
     * @see #getRAC50()
     * @generated
     */
    void setRAC50( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC50 <em>RAC50</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRAC50()
     * @see #getRAC50()
     * @see #setRAC50(Float)
     * @generated
     */
    void unsetRAC50();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC50 <em>RAC50</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RAC50</em>' attribute is set.
     * @see #unsetRAC50()
     * @see #getRAC50()
     * @see #setRAC50(Float)
     * @generated
     */
    boolean isSetRAC50();

    /**
     * Returns the value of the '<em><b>RAC75</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RAC75</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RAC75</em>' attribute.
     * @see #isSetRAC75()
     * @see #unsetRAC75()
     * @see #setRAC75(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_RAC75()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.rAC75' kind='element'"
     * @generated
     */
    Float getRAC75();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC75 <em>RAC75</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RAC75</em>' attribute.
     * @see #isSetRAC75()
     * @see #unsetRAC75()
     * @see #getRAC75()
     * @generated
     */
    void setRAC75( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC75 <em>RAC75</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRAC75()
     * @see #getRAC75()
     * @see #setRAC75(Float)
     * @generated
     */
    void unsetRAC75();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRAC75 <em>RAC75</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RAC75</em>' attribute is set.
     * @see #unsetRAC75()
     * @see #getRAC75()
     * @see #setRAC75(Float)
     * @generated
     */
    boolean isSetRAC75();

    /**
     * Returns the value of the '<em><b>Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radius</em>' attribute.
     * @see #isSetRadius()
     * @see #unsetRadius()
     * @see #setRadius(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_Radius()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.radius' kind='element'"
     * @generated
     */
    Float getRadius();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRadius <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radius</em>' attribute.
     * @see #isSetRadius()
     * @see #unsetRadius()
     * @see #getRadius()
     * @generated
     */
    void setRadius( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRadius <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRadius()
     * @see #getRadius()
     * @see #setRadius(Float)
     * @generated
     */
    void unsetRadius();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRadius <em>Radius</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Radius</em>' attribute is set.
     * @see #unsetRadius()
     * @see #getRadius()
     * @see #setRadius(Float)
     * @generated
     */
    boolean isSetRadius();

    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>RDC20</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RDC20</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RDC20</em>' attribute.
     * @see #isSetRDC20()
     * @see #unsetRDC20()
     * @see #setRDC20(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_RDC20()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.rDC20' kind='element'"
     * @generated
     */
    Float getRDC20();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRDC20 <em>RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RDC20</em>' attribute.
     * @see #isSetRDC20()
     * @see #unsetRDC20()
     * @see #getRDC20()
     * @generated
     */
    void setRDC20( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRDC20 <em>RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRDC20()
     * @see #getRDC20()
     * @see #setRDC20(Float)
     * @generated
     */
    void unsetRDC20();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getRDC20 <em>RDC20</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RDC20</em>' attribute is set.
     * @see #unsetRDC20()
     * @see #getRDC20()
     * @see #setRDC20(Float)
     * @generated
     */
    boolean isSetRDC20();

    /**
     * Returns the value of the '<em><b>Size Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Description</em>' attribute.
     * @see #isSetSizeDescription()
     * @see #unsetSizeDescription()
     * @see #setSizeDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_SizeDescription()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.sizeDescription' kind='element'"
     * @generated
     */
    String getSizeDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getSizeDescription <em>Size Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Description</em>' attribute.
     * @see #isSetSizeDescription()
     * @see #unsetSizeDescription()
     * @see #getSizeDescription()
     * @generated
     */
    void setSizeDescription( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getSizeDescription <em>Size Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeDescription()
     * @see #getSizeDescription()
     * @see #setSizeDescription(String)
     * @generated
     */
    void unsetSizeDescription();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getSizeDescription <em>Size Description</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size Description</em>' attribute is set.
     * @see #unsetSizeDescription()
     * @see #getSizeDescription()
     * @see #setSizeDescription(String)
     * @generated
     */
    boolean isSetSizeDescription();

    /**
     * Returns the value of the '<em><b>Strand Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strand Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strand Count</em>' attribute.
     * @see #isSetStrandCount()
     * @see #unsetStrandCount()
     * @see #setStrandCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_StrandCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.strandCount' kind='element'"
     * @generated
     */
    Integer getStrandCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getStrandCount <em>Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strand Count</em>' attribute.
     * @see #isSetStrandCount()
     * @see #unsetStrandCount()
     * @see #getStrandCount()
     * @generated
     */
    void setStrandCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getStrandCount <em>Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStrandCount()
     * @see #getStrandCount()
     * @see #setStrandCount(Integer)
     * @generated
     */
    void unsetStrandCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getStrandCount <em>Strand Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Strand Count</em>' attribute is set.
     * @see #unsetStrandCount()
     * @see #getStrandCount()
     * @see #setStrandCount(Integer)
     * @generated
     */
    boolean isSetStrandCount();

    /**
     * Returns the value of the '<em><b>Wire Phase Info</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo <em>Wire Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Phase Info</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Phase Info</em>' reference list.
     * @see #isSetWirePhaseInfo()
     * @see #unsetWirePhaseInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInfo_WirePhaseInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo
     * @model opposite="WireInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireInfo.WirePhaseInfo' kind='element'"
     * @generated
     */
    EList< WirePhaseInfo > getWirePhaseInfo();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getWirePhaseInfo <em>Wire Phase Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWirePhaseInfo()
     * @see #getWirePhaseInfo()
     * @generated
     */
    void unsetWirePhaseInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getWirePhaseInfo <em>Wire Phase Info</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Phase Info</em>' reference list is set.
     * @see #unsetWirePhaseInfo()
     * @see #getWirePhaseInfo()
     * @generated
     */
    boolean isSetWirePhaseInfo();

} // WireInfo
