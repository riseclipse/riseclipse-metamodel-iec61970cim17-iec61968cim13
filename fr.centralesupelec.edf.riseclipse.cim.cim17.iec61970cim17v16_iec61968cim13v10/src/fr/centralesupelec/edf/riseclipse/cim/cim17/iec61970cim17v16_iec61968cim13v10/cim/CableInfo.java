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
 * A representation of the model object '<em><b>Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getIsStrandFill <em>Is Strand Fill</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getSheathAsNeutral <em>Sheath As Neutral</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getShieldMaterial <em>Shield Material</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo()
 * @model
 * @generated
 */
public interface CableInfo extends WireInfo {
    /**
     * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableConstructionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Construction Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableConstructionKind
     * @see #isSetConstructionKind()
     * @see #unsetConstructionKind()
     * @see #setConstructionKind(CableConstructionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_ConstructionKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.constructionKind' kind='element'"
     * @generated
     */
    CableConstructionKind getConstructionKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Construction Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableConstructionKind
     * @see #isSetConstructionKind()
     * @see #unsetConstructionKind()
     * @see #getConstructionKind()
     * @generated
     */
    void setConstructionKind( CableConstructionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConstructionKind()
     * @see #getConstructionKind()
     * @see #setConstructionKind(CableConstructionKind)
     * @generated
     */
    void unsetConstructionKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Construction Kind</em>' attribute is set.
     * @see #unsetConstructionKind()
     * @see #getConstructionKind()
     * @see #setConstructionKind(CableConstructionKind)
     * @generated
     */
    boolean isSetConstructionKind();

    /**
     * Returns the value of the '<em><b>Diameter Over Core</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diameter Over Core</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diameter Over Core</em>' attribute.
     * @see #isSetDiameterOverCore()
     * @see #unsetDiameterOverCore()
     * @see #setDiameterOverCore(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_DiameterOverCore()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.diameterOverCore' kind='element'"
     * @generated
     */
    Float getDiameterOverCore();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diameter Over Core</em>' attribute.
     * @see #isSetDiameterOverCore()
     * @see #unsetDiameterOverCore()
     * @see #getDiameterOverCore()
     * @generated
     */
    void setDiameterOverCore( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiameterOverCore()
     * @see #getDiameterOverCore()
     * @see #setDiameterOverCore(Float)
     * @generated
     */
    void unsetDiameterOverCore();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diameter Over Core</em>' attribute is set.
     * @see #unsetDiameterOverCore()
     * @see #getDiameterOverCore()
     * @see #setDiameterOverCore(Float)
     * @generated
     */
    boolean isSetDiameterOverCore();

    /**
     * Returns the value of the '<em><b>Diameter Over Insulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diameter Over Insulation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diameter Over Insulation</em>' attribute.
     * @see #isSetDiameterOverInsulation()
     * @see #unsetDiameterOverInsulation()
     * @see #setDiameterOverInsulation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_DiameterOverInsulation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.diameterOverInsulation' kind='element'"
     * @generated
     */
    Float getDiameterOverInsulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diameter Over Insulation</em>' attribute.
     * @see #isSetDiameterOverInsulation()
     * @see #unsetDiameterOverInsulation()
     * @see #getDiameterOverInsulation()
     * @generated
     */
    void setDiameterOverInsulation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiameterOverInsulation()
     * @see #getDiameterOverInsulation()
     * @see #setDiameterOverInsulation(Float)
     * @generated
     */
    void unsetDiameterOverInsulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diameter Over Insulation</em>' attribute is set.
     * @see #unsetDiameterOverInsulation()
     * @see #getDiameterOverInsulation()
     * @see #setDiameterOverInsulation(Float)
     * @generated
     */
    boolean isSetDiameterOverInsulation();

    /**
     * Returns the value of the '<em><b>Diameter Over Jacket</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diameter Over Jacket</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diameter Over Jacket</em>' attribute.
     * @see #isSetDiameterOverJacket()
     * @see #unsetDiameterOverJacket()
     * @see #setDiameterOverJacket(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_DiameterOverJacket()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.diameterOverJacket' kind='element'"
     * @generated
     */
    Float getDiameterOverJacket();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diameter Over Jacket</em>' attribute.
     * @see #isSetDiameterOverJacket()
     * @see #unsetDiameterOverJacket()
     * @see #getDiameterOverJacket()
     * @generated
     */
    void setDiameterOverJacket( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiameterOverJacket()
     * @see #getDiameterOverJacket()
     * @see #setDiameterOverJacket(Float)
     * @generated
     */
    void unsetDiameterOverJacket();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diameter Over Jacket</em>' attribute is set.
     * @see #unsetDiameterOverJacket()
     * @see #getDiameterOverJacket()
     * @see #setDiameterOverJacket(Float)
     * @generated
     */
    boolean isSetDiameterOverJacket();

    /**
     * Returns the value of the '<em><b>Diameter Over Screen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diameter Over Screen</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diameter Over Screen</em>' attribute.
     * @see #isSetDiameterOverScreen()
     * @see #unsetDiameterOverScreen()
     * @see #setDiameterOverScreen(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_DiameterOverScreen()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.diameterOverScreen' kind='element'"
     * @generated
     */
    Float getDiameterOverScreen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diameter Over Screen</em>' attribute.
     * @see #isSetDiameterOverScreen()
     * @see #unsetDiameterOverScreen()
     * @see #getDiameterOverScreen()
     * @generated
     */
    void setDiameterOverScreen( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiameterOverScreen()
     * @see #getDiameterOverScreen()
     * @see #setDiameterOverScreen(Float)
     * @generated
     */
    void unsetDiameterOverScreen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diameter Over Screen</em>' attribute is set.
     * @see #unsetDiameterOverScreen()
     * @see #getDiameterOverScreen()
     * @see #setDiameterOverScreen(Float)
     * @generated
     */
    boolean isSetDiameterOverScreen();

    /**
     * Returns the value of the '<em><b>Is Strand Fill</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Strand Fill</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Strand Fill</em>' attribute.
     * @see #isSetIsStrandFill()
     * @see #unsetIsStrandFill()
     * @see #setIsStrandFill(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_IsStrandFill()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.isStrandFill' kind='element'"
     * @generated
     */
    Boolean getIsStrandFill();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getIsStrandFill <em>Is Strand Fill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Strand Fill</em>' attribute.
     * @see #isSetIsStrandFill()
     * @see #unsetIsStrandFill()
     * @see #getIsStrandFill()
     * @generated
     */
    void setIsStrandFill( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getIsStrandFill <em>Is Strand Fill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsStrandFill()
     * @see #getIsStrandFill()
     * @see #setIsStrandFill(Boolean)
     * @generated
     */
    void unsetIsStrandFill();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getIsStrandFill <em>Is Strand Fill</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Strand Fill</em>' attribute is set.
     * @see #unsetIsStrandFill()
     * @see #getIsStrandFill()
     * @see #setIsStrandFill(Boolean)
     * @generated
     */
    boolean isSetIsStrandFill();

    /**
     * Returns the value of the '<em><b>Nominal Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal Temperature</em>' attribute.
     * @see #isSetNominalTemperature()
     * @see #unsetNominalTemperature()
     * @see #setNominalTemperature(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_NominalTemperature()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.nominalTemperature' kind='element'"
     * @generated
     */
    Float getNominalTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Temperature</em>' attribute.
     * @see #isSetNominalTemperature()
     * @see #unsetNominalTemperature()
     * @see #getNominalTemperature()
     * @generated
     */
    void setNominalTemperature( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalTemperature()
     * @see #getNominalTemperature()
     * @see #setNominalTemperature(Float)
     * @generated
     */
    void unsetNominalTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Temperature</em>' attribute is set.
     * @see #unsetNominalTemperature()
     * @see #getNominalTemperature()
     * @see #setNominalTemperature(Float)
     * @generated
     */
    boolean isSetNominalTemperature();

    /**
     * Returns the value of the '<em><b>Outer Jacket Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableOuterJacketKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outer Jacket Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outer Jacket Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableOuterJacketKind
     * @see #isSetOuterJacketKind()
     * @see #unsetOuterJacketKind()
     * @see #setOuterJacketKind(CableOuterJacketKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_OuterJacketKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.outerJacketKind' kind='element'"
     * @generated
     */
    CableOuterJacketKind getOuterJacketKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outer Jacket Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableOuterJacketKind
     * @see #isSetOuterJacketKind()
     * @see #unsetOuterJacketKind()
     * @see #getOuterJacketKind()
     * @generated
     */
    void setOuterJacketKind( CableOuterJacketKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOuterJacketKind()
     * @see #getOuterJacketKind()
     * @see #setOuterJacketKind(CableOuterJacketKind)
     * @generated
     */
    void unsetOuterJacketKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outer Jacket Kind</em>' attribute is set.
     * @see #unsetOuterJacketKind()
     * @see #getOuterJacketKind()
     * @see #setOuterJacketKind(CableOuterJacketKind)
     * @generated
     */
    boolean isSetOuterJacketKind();

    /**
     * Returns the value of the '<em><b>Sheath As Neutral</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sheath As Neutral</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sheath As Neutral</em>' attribute.
     * @see #isSetSheathAsNeutral()
     * @see #unsetSheathAsNeutral()
     * @see #setSheathAsNeutral(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_SheathAsNeutral()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.sheathAsNeutral' kind='element'"
     * @generated
     */
    Boolean getSheathAsNeutral();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getSheathAsNeutral <em>Sheath As Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sheath As Neutral</em>' attribute.
     * @see #isSetSheathAsNeutral()
     * @see #unsetSheathAsNeutral()
     * @see #getSheathAsNeutral()
     * @generated
     */
    void setSheathAsNeutral( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getSheathAsNeutral <em>Sheath As Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSheathAsNeutral()
     * @see #getSheathAsNeutral()
     * @see #setSheathAsNeutral(Boolean)
     * @generated
     */
    void unsetSheathAsNeutral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getSheathAsNeutral <em>Sheath As Neutral</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sheath As Neutral</em>' attribute is set.
     * @see #unsetSheathAsNeutral()
     * @see #getSheathAsNeutral()
     * @see #setSheathAsNeutral(Boolean)
     * @generated
     */
    boolean isSetSheathAsNeutral();

    /**
     * Returns the value of the '<em><b>Shield Material</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableShieldMaterialKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shield Material</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shield Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableShieldMaterialKind
     * @see #isSetShieldMaterial()
     * @see #unsetShieldMaterial()
     * @see #setShieldMaterial(CableShieldMaterialKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCableInfo_ShieldMaterial()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CableInfo.shieldMaterial' kind='element'"
     * @generated
     */
    CableShieldMaterialKind getShieldMaterial();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shield Material</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableShieldMaterialKind
     * @see #isSetShieldMaterial()
     * @see #unsetShieldMaterial()
     * @see #getShieldMaterial()
     * @generated
     */
    void setShieldMaterial( CableShieldMaterialKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShieldMaterial()
     * @see #getShieldMaterial()
     * @see #setShieldMaterial(CableShieldMaterialKind)
     * @generated
     */
    void unsetShieldMaterial();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shield Material</em>' attribute is set.
     * @see #unsetShieldMaterial()
     * @see #getShieldMaterial()
     * @see #setShieldMaterial(CableShieldMaterialKind)
     * @generated
     */
    boolean isSetShieldMaterial();

} // CableInfo
