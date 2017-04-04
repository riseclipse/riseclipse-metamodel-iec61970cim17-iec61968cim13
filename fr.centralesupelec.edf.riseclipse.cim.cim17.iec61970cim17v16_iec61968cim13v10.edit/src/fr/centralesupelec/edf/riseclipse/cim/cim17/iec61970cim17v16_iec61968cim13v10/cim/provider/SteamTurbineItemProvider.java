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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SteamTurbineItemProvider extends PrimeMoverItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SteamTurbineItemProvider( AdapterFactory adapterFactory ) {
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

            addCrossoverTCPropertyDescriptor( object );
            addReheater1TCPropertyDescriptor( object );
            addReheater2TCPropertyDescriptor( object );
            addShaft1PowerHPPropertyDescriptor( object );
            addShaft1PowerIPPropertyDescriptor( object );
            addShaft1PowerLP1PropertyDescriptor( object );
            addShaft1PowerLP2PropertyDescriptor( object );
            addShaft2PowerHPPropertyDescriptor( object );
            addShaft2PowerIPPropertyDescriptor( object );
            addShaft2PowerLP1PropertyDescriptor( object );
            addShaft2PowerLP2PropertyDescriptor( object );
            addSteamChestTCPropertyDescriptor( object );
            addSteamSupplysPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Crossover TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrossoverTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_crossoverTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_crossoverTC_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_CrossoverTC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reheater1 TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReheater1TCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_reheater1TC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_reheater1TC_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Reheater1TC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reheater2 TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReheater2TCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_reheater2TC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_reheater2TC_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Reheater2TC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft1 Power HP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft1PowerHPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft1PowerHP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft1PowerHP_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft1PowerHP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft1 Power IP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft1PowerIPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft1PowerIP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft1PowerIP_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft1PowerIP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft1 Power LP1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft1PowerLP1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft1PowerLP1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft1PowerLP1_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft1PowerLP1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft1 Power LP2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft1PowerLP2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft1PowerLP2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft1PowerLP2_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft1PowerLP2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft2 Power HP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft2PowerHPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft2PowerHP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft2PowerHP_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft2PowerHP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft2 Power IP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft2PowerIPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft2PowerIP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft2PowerIP_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft2PowerIP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft2 Power LP1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft2PowerLP1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft2PowerLP1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft2PowerLP1_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft2PowerLP1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Shaft2 Power LP2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShaft2PowerLP2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_shaft2PowerLP2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_shaft2PowerLP2_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_Shaft2PowerLP2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Steam Chest TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamChestTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_steamChestTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_steamChestTC_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_SteamChestTC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Steam Supplys feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamSupplysPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SteamTurbine_SteamSupplys_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SteamTurbine_SteamSupplys_feature",
                                "_UI_SteamTurbine_type" ),
                        CimPackage.eINSTANCE.getSteamTurbine_SteamSupplys(), true, false, true, null, null, null ) );
    }

    /**
     * This returns SteamTurbine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SteamTurbine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SteamTurbine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SteamTurbine_type" )
                : getString( "_UI_SteamTurbine_type" ) + " " + label;
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

        switch( notification.getFeatureID( SteamTurbine.class ) ) {
        case CimPackage.STEAM_TURBINE__CROSSOVER_TC:
        case CimPackage.STEAM_TURBINE__REHEATER1_TC:
        case CimPackage.STEAM_TURBINE__REHEATER2_TC:
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
        case CimPackage.STEAM_TURBINE__STEAM_CHEST_TC:
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
