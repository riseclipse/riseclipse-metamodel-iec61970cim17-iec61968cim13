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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroR;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroR} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroRItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroRItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addAtPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addDturbPropertyDescriptor( object );
            addEpsPropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addH0PropertyDescriptor( object );
            addInputSignalPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addQnlPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addT7PropertyDescriptor( object );
            addT8PropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTtPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addVelclPropertyDescriptor( object );
            addVelopPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_at_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_at_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_At(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_db1_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Db1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_db2_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Db2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_dturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_dturb_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Dturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_eps_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Eps(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gmax_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gmin_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv1_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv2_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv3_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv4_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv5_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_gv6_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Gv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the H0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addH0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_h0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_h0_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_H0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_inputSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_inputSignal_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_InputSignal(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_kg_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Kg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_ki_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_mwbase_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv1_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv2_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv3_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv4_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv5_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pgv6_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pgv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pmax_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_pmin_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Pmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qnl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQnlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_qnl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_qnl_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Qnl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_r_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t1_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t2_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t3_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t4_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t5_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t6_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t7_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_t8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_t8_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_T8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_td_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Td(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_tp_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_tt_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_tw_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Tw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velcl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_velcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_velcl_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Velcl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroR_velop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroR_velop_feature",
                                "_UI_GovHydroR_type" ),
                        CimPackage.eINSTANCE.getGovHydroR_Velop(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydroR.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroR" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroR ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroR_type" )
                : getString( "_UI_GovHydroR_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( GovHydroR.class ) ) {
        case CimPackage.GOV_HYDRO_R__AT:
        case CimPackage.GOV_HYDRO_R__DB1:
        case CimPackage.GOV_HYDRO_R__DB2:
        case CimPackage.GOV_HYDRO_R__DTURB:
        case CimPackage.GOV_HYDRO_R__EPS:
        case CimPackage.GOV_HYDRO_R__GMAX:
        case CimPackage.GOV_HYDRO_R__GMIN:
        case CimPackage.GOV_HYDRO_R__GV1:
        case CimPackage.GOV_HYDRO_R__GV2:
        case CimPackage.GOV_HYDRO_R__GV3:
        case CimPackage.GOV_HYDRO_R__GV4:
        case CimPackage.GOV_HYDRO_R__GV5:
        case CimPackage.GOV_HYDRO_R__GV6:
        case CimPackage.GOV_HYDRO_R__H0:
        case CimPackage.GOV_HYDRO_R__INPUT_SIGNAL:
        case CimPackage.GOV_HYDRO_R__KG:
        case CimPackage.GOV_HYDRO_R__KI:
        case CimPackage.GOV_HYDRO_R__MWBASE:
        case CimPackage.GOV_HYDRO_R__PGV1:
        case CimPackage.GOV_HYDRO_R__PGV2:
        case CimPackage.GOV_HYDRO_R__PGV3:
        case CimPackage.GOV_HYDRO_R__PGV4:
        case CimPackage.GOV_HYDRO_R__PGV5:
        case CimPackage.GOV_HYDRO_R__PGV6:
        case CimPackage.GOV_HYDRO_R__PMAX:
        case CimPackage.GOV_HYDRO_R__PMIN:
        case CimPackage.GOV_HYDRO_R__QNL:
        case CimPackage.GOV_HYDRO_R__R:
        case CimPackage.GOV_HYDRO_R__T1:
        case CimPackage.GOV_HYDRO_R__T2:
        case CimPackage.GOV_HYDRO_R__T3:
        case CimPackage.GOV_HYDRO_R__T4:
        case CimPackage.GOV_HYDRO_R__T5:
        case CimPackage.GOV_HYDRO_R__T6:
        case CimPackage.GOV_HYDRO_R__T7:
        case CimPackage.GOV_HYDRO_R__T8:
        case CimPackage.GOV_HYDRO_R__TD:
        case CimPackage.GOV_HYDRO_R__TP:
        case CimPackage.GOV_HYDRO_R__TT:
        case CimPackage.GOV_HYDRO_R__TW:
        case CimPackage.GOV_HYDRO_R__VELCL:
        case CimPackage.GOV_HYDRO_R__VELOP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
